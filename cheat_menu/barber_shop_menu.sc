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
                    GOTO haircut_style_menu_2
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    DELETE_MENU 0
                    GOTO haircut_style_menu_3
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    GOTO player_menu
}

{
haircut_style_menu_1:
    LVAR_INT hcsmid selected txt mdl
    CREATE_MENU bsmn 210.0 100.0 200.0 1 TRUE TRUE 0 hcsmid
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


{
haircut_style_menu_2:
    LVAR_INT hcsmid selected txt mdl
    CREATE_MENU bsmn 210.0 100.0 200.0 1 TRUE TRUE 0 hcsmid
    SET_MENU_COLUMN hcsmid 0 DUMMY hcmr12 hcmr13 hcmr14 hcmr15 hcmr16 hcmr17 hcmr18 hcmr19 hcmr20 hcmr21 DUMMY DUMMY

    GET_CLOTHES_ITEM 0 HEAD txt mdl
    SWITCH txt 
        case HAIRRED
            ACTIVATE_MENU_ITEM hcsmid 0 0
        BREAK
        case HAIRBLUE
            ACTIVATE_MENU_ITEM hcsmid 1 0
        BREAK 
        case HAIRGREEN
            ACTIVATE_MENU_ITEM hcsmid 2 0
        BREAK
        case BALD
            ACTIVATE_MENU_ITEM hcsmid 3 0
        BREAK
        case BALDTASH
            ACTIVATE_MENU_ITEM hcsmid 4 0
        BREAK
        case BALDGOATEE
            ACTIVATE_MENU_ITEM hcsmid 5 0
        BREAK
        case BEARD
            ACTIVATE_MENU_ITEM hcsmid 6 0
        BREAK
        case SLOPE
            ACTIVATE_MENU_ITEM hcsmid 7 0
        BREAK
        case MOHAWKBEARD
            ACTIVATE_MENU_ITEM hcsmid 8 0
        BREAK
        case ELVISHAIR
            ACTIVATE_MENU_ITEM hcsmid 9 0
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
                    GIVE_PLAYER_CLOTHES 0 HAIRRED HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Red Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HAIRBLUE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Blue Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HAIRGREEN HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Green Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BALD HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Bald Head set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BALDTASH HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Bald & Stash set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BALDGOATEE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Bald & Goatee set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BEARD HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar & Beard set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SLOPE SLOPE HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Slope set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 MOHAWKBEARD MOHAWK HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Mohawk & Beard set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 ELVISHAIR ELVISHAIR HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Elvis Hair set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO barber_shop_menu
}


{
haircut_style_menu_3:
    LVAR_INT hcsmid selected txt mdl
    CREATE_MENU bsmn 210.0 100.0 200.0 1 TRUE TRUE 0 hcsmid
    SET_MENU_COLUMN hcsmid 0 DUMMY hcmr22 hcmr23 hcmr24 hcmr25 hcmr26 hcmr27 hcmr28 hcmr29 hcmr30 hcmr31 hcmr32 DUMMY

    GET_CLOTHES_ITEM 0 HEAD txt mdl
    SWITCH txt 
        case TASH
            ACTIVATE_MENU_ITEM hcsmid 0 0
        BREAK
        case GOATEE
            ACTIVATE_MENU_ITEM hcsmid 1 0
        BREAK 
        case BEARD
            ACTIVATE_MENU_ITEM hcsmid 2 0
        BREAK
        case AFRO
            ACTIVATE_MENU_ITEM hcsmid 3 0
        BREAK
        case AFROTASH
            ACTIVATE_MENU_ITEM hcsmid 4 0
        BREAK
        case AFROGOATEE
            ACTIVATE_MENU_ITEM hcsmid 5 0
        BREAK
        case AFROBEARD
            ACTIVATE_MENU_ITEM hcsmid 6 0
        BREAK
        case FLATTOP
            ACTIVATE_MENU_ITEM hcsmid 7 0
        BREAK
        case JHERICURL
            ACTIVATE_MENU_ITEM hcsmid 8 0
        BREAK
        case CORNROWS
            ACTIVATE_MENU_ITEM hcsmid 9 0
        BREAK
        case HIGHFADE
            ACTIVATE_MENU_ITEM hcsmid 10 0
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
                    GIVE_PLAYER_CLOTHES 0 TASH HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar & Stash set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 GOATEE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar & Goatee set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BEARD HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cesar & Beard set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 AFRO AFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Afro set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 AFROTASH AFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Afro & Stash set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 AFROGOATEE AFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Afro & Goatee set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 AFROBEARD AFRO HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Afro & Beard set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 FLATTOP FLATTOP HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "FlatTop set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 JHERICURL JHERI HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Jheri Curl set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CORNROWS CORNROWS HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Cornrow set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HIGHFADE HEAD HEAD
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "High Fade set"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
    ENDWHILE
    
    DELETE_MENU 0
    GOTO barber_shop_menu
}