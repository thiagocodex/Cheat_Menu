{
vehicle_spawner_menu:
    DELETE_MENU 0

    LVAR_INT vsmid selected
    CREATE_MENU vsauxmn 210.0 100.0 200.0 1 TRUE TRUE 0 vsmid
    SET_MENU_COLUMN vsmid 0 DUMMY vspag1 vspag2 boatmr DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER pmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED vsmid selected

        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO aircraft_spawner_menu
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO vehicle_page_2_menu
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO cheat_menu
}