{
vehicle:
    DELETE_MENU 0
    LVAR_INT vmid selected
    CREATE_MENU vmn 210.0 100.0 200.0 1 TRUE TRUE 0 vmid
    SET_MENU_COLUMN vmid 0 DUMMY vomn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED vmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO vehicle_options
                ENDIF
            BREAK
             CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO vehicle_spawner_menu
                ENDIF
            BREAK 
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO cheat_menu
}


{
vehicle_options:
    LVAR_INT vomid player selected
    GET_PLAYER_CHAR 0 player
    
    CREATE_MENU vomn 210.0 100.0 200.0 1 TRUE TRUE 0 vomid
    SET_MENU_COLUMN vomid 0 vomn vcmn vcmn2 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED vomid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    IF IS_CHAR_IN_ANY_CAR player
                        DELETE_MENU 0
                        GOTO vehicle_color1
                    ELSE
                        PRINT_HELP vcwng
                        GOTO ok_go_to_main
                    ENDIF
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    IF IS_CHAR_IN_ANY_CAR player
                        DELETE_MENU 0
                        GOTO vehicle_color2
                    ELSE
                        PRINT_HELP vcwng
                        GOTO ok_go_to_main
                    ENDIF
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO vehicle_spawner_menu
}




{
vehicle_color1:
    LVAR_INT vcmid player pcar selected

    GET_PLAYER_CHAR 0 player

    CREATE_MENU_GRID vcmn 32.0 113.0 25.0 8 TRUE TRUE 1 vcmid
    GET_CAR_CHAR_IS_USING player pcar
    PRINT_HELP vchelp
        WAIT 0
    PRINT_HELP_FOREVER vchelp

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED vcmid selected
        CHANGE_CAR_COLOUR_FROM_MENU vcmid pcar 1 selected
        IF IS_BUTTON_PRESSED PAD1 CROSS
            REPORT_MISSION_AUDIO_EVENT_AT_CAR pcar 1134
            FIX_CAR pcar
            CLEAR_HELP
            GOTO ok_go_to_main
        ENDIF
    ENDWHILE
    DELETE_MENU 0
    GOTO vehicle
}


{
vehicle_color2:
    LVAR_INT vcmid2 player pcar selected

    GET_PLAYER_CHAR 0 player

    CREATE_MENU_GRID vcmn2 32.0 113.0 25.0 8 TRUE TRUE 1 vcmid2
    GET_CAR_CHAR_IS_USING player pcar
    PRINT_HELP vchelp
        WAIT 0
    PRINT_HELP_FOREVER vchelp

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED vcmid2 selected
        CHANGE_CAR_COLOUR_FROM_MENU vcmid2 pcar 2 selected
        IF IS_BUTTON_PRESSED PAD1 CROSS
            REPORT_MISSION_AUDIO_EVENT_AT_CAR pcar 1134
            FIX_CAR pcar
            CLEAR_HELP
            GOTO ok_go_to_main
        ENDIF
    ENDWHILE
    DELETE_MENU 0
    GOTO vehicle_options
}