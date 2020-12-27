{
barber_shop_menu:

    DELETE_MENU 0

    LVAR_INT bsmid selected
    CREATE_MENU bsmn 210.0 100.0 200.0 1 TRUE TRUE 0 bsmid
    SET_MENU_COLUMN bsmid 0 DUMMY hcsmn1 hcsmn2 hcsmn3 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY

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
                    GOTO haircut_style_menu_1
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    //GOTO haircut_style_menu
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    //GOTO haircut_style_menu
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    GOTO player_menu
}

{
haircut_style_menu_1:
    LVAR_INT hcsmid selected txt mdl
    CREATE_MENU hcsmn 210.0 100.0 200.0 1 TRUE TRUE 0 hcsmid
    SET_MENU_COLUMN hcsmid 0 DUMMY hcmr0 hcmr1 hcmr2 hcmr3 hcmr4 hcmr5 hcmr6 hcmr7 hcmr8 hcmr9 hcmr10 hcmr11

    GET_CLOTHES_ITEM 0 HEAD txt mdl
    SWITCH txt 
        case PLAYER_FACE
            ACTIVATE_MENU_ITEM hcsmid 0 0
        BREAK
        case HAIRBLOND
            ACTIVATE_MENU_ITEM hcsmid 1 0
        BREAK 
        case HAIRPINK
            ACTIVATE_MENU_ITEM hcsmid 2 0
        BREAK
        case AFROBLOND
            ACTIVATE_MENU_ITEM hcsmid 3 0
        BREAK
        case CORNROWSB
            ACTIVATE_MENU_ITEM hcsmid 4 0
        BREAK
        case HIGHAFRO
            ACTIVATE_MENU_ITEM hcsmid 5 0
        BREAK
        case WEDGE
            ACTIVATE_MENU_ITEM hcsmid 6 0
        BREAK
        case TRAMLINE
            ACTIVATE_MENU_ITEM hcsmid 7 0
        BREAK
        case GROOVECUT
            ACTIVATE_MENU_ITEM hcsmid 8 0
        BREAK
        case MOHAWK
            ACTIVATE_MENU_ITEM hcsmid 9 0
        BREAK
        case MOHAWKBLOND
            ACTIVATE_MENU_ITEM hcsmid 10 0
        BREAK
        case MOHAWKPINK
            ACTIVATE_MENU_ITEM hcsmid 11 0
        BREAK
    ENDSWITCH



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
                    GIVE_PLAYER_CLOTHES 0 PLAYER_FACE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HAIRBLOND HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Blonde Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HAIRPINK HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Pink Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 AFROBLOND AFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Blonde Afro set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CORNROWSB CORNROWS HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Blonde Cornrow set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HIGHAFRO HIGHAFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "High Afro set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WEDGE WEDGE HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Wedge set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRAMLINE TRAMLINE HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Detail Cut set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 GROOVECUT GROOVECUT HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Groove Cut set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 MOHAWK MOHAWK HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Mohawk set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 MOHAWKBLOND MOHAWK HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Blonde Mohawk set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 MOHAWKPINK MOHAWK HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Pink Mohawk set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO barber_shop_menu
}