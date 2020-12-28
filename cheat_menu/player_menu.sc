{
player_menu:
    DELETE_MENU 0

    LVAR_INT pmid selected
    CREATE_MENU pmn 210.0 100.0 200.0 1 TRUE TRUE 0 pmid
    SET_MENU_COLUMN pmid 0 DUMMY amn bsmn psmn wlmn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER pmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED pmid selected

        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO apparel_menu
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO barber_shop_menu
                ENDIF
            BREAK
            CASE 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO player_stats_menu
                ENDIF
            BREAK
            CASE 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO wanted_level
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO cheat_menu
}

{
wanted_level:  
    DELETE_MENU 0
    LVAR_INT wlmid selected
    CREATE_MENU wlmn 210.0 100.0 200.0 1 TRUE TRUE 0 wlmid
    SET_MENU_COLUMN wlmid 0 DUMMY wlmr0 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED wlmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    CLEAR_WANTED_LEVEL 0
                    PRINT_HELP_STRING "Wanted level cleared"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO player_stats_menu

}