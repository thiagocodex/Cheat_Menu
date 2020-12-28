{
apparel_menu:
    DELETE_MENU 0

    LVAR_INT amid selected
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 amid
    SET_MENU_COLUMN amid 0 DUMMY bmn plmn sumn rcmn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
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
            CASE 3              
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO remove_clothes_menu
                ENDIF
            BREAK        
        ENDSWITCH
    ENDWHILE
    
    GOTO player_menu
}

{
remove_clothes_menu:
    LVAR_INT rcmid selected
    DELETE_MENU 0
    CREATE_MENU rcmn 210.0 100.0 200.0 1 TRUE TRUE 0 rcmid
    SET_MENU_COLUMN rcmid 0 DUMMY rcmr0 rcmr1 rcmr2 rcmr3 rcmr4 rcmr5 rcmr6 rcmr7 DUMMY DUMMY DUMMY DUMMY
    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    GET_MENU_ITEM_SELECTED rcmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 0
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Torso by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Legs by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 3
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Shoes by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 13
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Necklace by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 14
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Watch/Bracelet by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 15
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Glasses by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 16
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Hat by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 0 0 17
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Removed Special Costume by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    DELETE_MENU 0
    GOTO apparel_menu
}