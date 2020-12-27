{
player_stats_menu:
    DELETE_MENU 0

    LVAR_INT psmid selected
    CREATE_MENU psmn 210.0 100.0 200.0 1 TRUE TRUE 0 psmid
    SET_MENU_COLUMN psmid 0 DUMMY fatmn mscmn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED psmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO fat_stats_menu
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO muscle_stats_menu
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO player_menu

}

{
fat_stats_menu:
    LVAR_INT fatmid selected
    CREATE_MENU fatmn 210.0 100.0 200.0 1 TRUE TRUE 0 fatmid
    SET_MENU_COLUMN fatmid 0 DUMMY fatmr0 fatmr1 fatmr2 fatmr3 fatmr4 fatmr5 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED fatmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 0.0 
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became thin by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 200.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became skinny by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 300.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became normal by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 500.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became little fat by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 800.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became fat by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 21 1000.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "You became obese by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO player_stats_menu
}



{
muscle_stats_menu:
    LVAR_INT mscmid selected
    CREATE_MENU fatmn 210.0 100.0 200.0 1 TRUE TRUE 0 mscmid
    SET_MENU_COLUMN mscmid 0 DUMMY mscmr0 mscmr1 mscmr2 mscmr3 mscmr4 mscmr5 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED mscmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 0.0 
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 0 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 200.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 200 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 400.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 400 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 600.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 600 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 800.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 800 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            CASE 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    SET_FLOAT_STAT 23 1000.0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Muscle set to 1000 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO player_stats_menu

}