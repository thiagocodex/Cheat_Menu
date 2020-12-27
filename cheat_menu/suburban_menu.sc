{
suburban_menu:
DELETE_MENU 0
LVAR_INT sbmid selected

CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 sbmid
SET_MENU_COLUMN sbmid 0 DUMMY torso DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY


    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED sbmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO sutorso_menu
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    //GOTO sulegs_menu
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    //GOTO sushoes_menu
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO apparel_menu

}


{
sutorso_menu:
    DELETE_MENU 0

    LVAR_INT sutmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 sutmid
    SET_MENU_COLUMN sutmid 0 DUMMY sutr0 sutr1 sutr2 sutr3 sutr4 sutr5 sutr6 sutr7 sutr8 sutr9 sutr10 sutr11
    PRINT_HELP_FOREVER CLOTHB
    
    GET_CLOTHES_ITEM 0 TORSO txt mdl
    SWITCH txt 
        case TSHIRTHEATWHT
            ACTIVATE_MENU_ITEM sutmid 0 0
        BREAK
        case TSHIRTBOBOMONK
            ACTIVATE_MENU_ITEM sutmid 1 0
        BREAK 
        case TSHIRTBOBORED
            ACTIVATE_MENU_ITEM sutmid 2 0
        BREAK
        case TSHIRTBASE5
            ACTIVATE_MENU_ITEM sutmid 3 0
        BREAK
        case TSHIRTSUBURB
            ACTIVATE_MENU_ITEM sutmid 4 0
        BREAK        
        case HOODYAMERC
            ACTIVATE_MENU_ITEM sutmid 5 0
        BREAK
        case HOODYABASE5
            ACTIVATE_MENU_ITEM sutmid 6 0
        BREAK
        case HOODYAROCKSTAR
            ACTIVATE_MENU_ITEM sutmid 7 0
        BREAK
        case COACH
            ACTIVATE_MENU_ITEM sutmid 8 0
        BREAK
        case COACHSEMI
            ACTIVATE_MENU_ITEM sutmid 9 0
        BREAK
        case SWEATRSTAR
            ACTIVATE_MENU_ITEM sutmid 10 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED sutmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTHEATWHT TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave White Heat T by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTBOBOMONK TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Bobo Ape T by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTBOBORED TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Red Bobo T by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTBASE5 TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Base 5 T by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTSUBURB TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Suburban T by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HOODYAMERC HOODYA TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Mercury Hood by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HOODYABASE5 HOODYA TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Base 5 Hood by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HOODYAROCKSTAR HOODYA TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Rockstar Hood by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WCOATBLUE WCOAT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Vest & T-Shirt by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 COACH COACH TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Grn Windbreaker by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 COACHSEMI COACH TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blk Windbreaker by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SWEATRSTAR SWEAT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Rockstar Sweat by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
 
    GOTO suburban_menu

}