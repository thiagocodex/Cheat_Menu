{
apparel_menu:
    DELETE_MENU 0

    LVAR_INT amid selected
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 amid
    SET_MENU_COLUMN amid 0 DUMMY bmn plmn sumn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER amh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED amid selected
        
        SWITCH selected
            CASE 0              
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binco_menu
                ENDIF
            BREAK
            CASE 1              
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO prolaps_menu
                ENDIF
            BREAK    
            CASE 2              
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO suburban_menu
                ENDIF
            BREAK        
        ENDSWITCH
    ENDWHILE
    
    GOTO player_menu
}