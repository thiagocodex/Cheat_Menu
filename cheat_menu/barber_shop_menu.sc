{
barber_shop_menu:

    DELETE_MENU 0

    LVAR_INT bsmid selected
    CREATE_MENU bsmn 210.0 100.0 200.0 1 TRUE TRUE 0 bsmid
    SET_MENU_COLUMN bsmid 0 DUMMY hcsmn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED bsmid selected
        
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO haircut_style_menu
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    GOTO player_menu
}

{
haircut_style_menu:
    LVAR_INT hcsmid selected
    CREATE_MENU hcsmn 210.0 100.0 200.0 1 TRUE TRUE 0 hcsmid
    SET_MENU_COLUMN hcsmid 0 DUMMY hcmr0 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE
    
    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
        GET_MENU_ITEM_SELECTED hcsmid selected

        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_HAIR 0 PLAYER_FACE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar haircut set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO barber_shop_menu
}