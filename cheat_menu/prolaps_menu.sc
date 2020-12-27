
{
prolaps_menu:
    DELETE_MENU 0
    LVAR_INT plmid selected 
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 plmid
    SET_MENU_COLUMN plmid 0 DUMMY torso legs shoes DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER WARDH3

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED plmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO pltorso_menu
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO pllegs_menu
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO plshoes_menu
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO apparel_menu
}

{
pltorso_menu:
    DELETE_MENU 0

    LVAR_INT pltmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 pltmid
    SET_MENU_COLUMN pltmid 0 DUMMY pltr0 pltr1 pltr2 pltr3 pltr4 pltr5 pltr6 pltr7 pltr8 pltr9 pltr10 pltr11
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 TORSO txt mdl
    SWITCH txt 
        case BBJACKRIM
            ACTIVATE_MENU_ITEM pltmid 0 0
        BREAK
        case BBALLJACKRSTAR
            ACTIVATE_MENU_ITEM pltmid 1 0
        BREAK 
        case BASKBALLDRIB
            ACTIVATE_MENU_ITEM pltmid 2 0
        BREAK
        case BASKBALLRIM
            ACTIVATE_MENU_ITEM pltmid 3 0
        BREAK
        case SIXTYNINERS
            ACTIVATE_MENU_ITEM pltmid 4 0
        BREAK
        case TSHIRTPRORED
            ACTIVATE_MENU_ITEM pltmid 5 0
        BREAK
        case TSHIRTPROBLK
            ACTIVATE_MENU_ITEM pltmid 6 0
        BREAK
        case BANDITS
            ACTIVATE_MENU_ITEM pltmid 7 0
        BREAK
        case TRACKYTOP1PRO
            ACTIVATE_MENU_ITEM pltmid 8 0
        BREAK
            case SHELLSUIT
            ACTIVATE_MENU_ITEM pltmid 9 0
        BREAK
        case HOCKEYTOP
            ACTIVATE_MENU_ITEM pltmid 10 0
        BREAK
        case BBJERSEY
            ACTIVATE_MENU_ITEM pltmid 11 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED pltmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BBJACKRIM BBJACK TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Rimmers Jacket by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BBALLJACKRSTAR BBJACK TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave R-Star Jacket by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASKBALLDRIB BASKBALL TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Dribblers Vest by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASKBALLRIM BASKBALL TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Saint's Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SIXTYNINERS TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave 69ers T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTPRORED TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave ProLaps T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTPROBLK TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave ProLaps Black T by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDITS BASEBALL TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Bandits Top by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKYTOP1PRO TRACKYTOP1 TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Track Top by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SHELLSUIT TRACKYTOP1 TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Leisure Top by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HOCKEYTOP SWEAT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Slappers Top by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BBJERSEY SLEEVT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Baseball T by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
 
    GOTO prolaps_menu
}

{
pllegs_menu:
    DELETE_MENU 0

    LVAR_INT pllmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 pllmid
    SET_MENU_COLUMN pllmid 0 DUMMY pllr0 pllr1 pllr2 pllr3 pllr4 pllr5 pllr6 DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 LEGS txt mdl
    SWITCH txt 
        case TRACKTRPRO
            ACTIVATE_MENU_ITEM pllmid 0 0
        BREAK
        case TRACKTRWHSTR
            ACTIVATE_MENU_ITEM pllmid 1 0
        BREAK 
        case RACKTRBLUE
            ACTIVATE_MENU_ITEM pllmid 2 0
        BREAK
        case BBSHORTWHT
            ACTIVATE_MENU_ITEM pllmid 3 0
        BREAK
        case BOXSHORT
            ACTIVATE_MENU_ITEM pllmid 5 0
        BREAK        
        case BBSHORTRED
            ACTIVATE_MENU_ITEM pllmid 4 0
        BREAK
        case SHELLSUITTR
            ACTIVATE_MENU_ITEM pllmid 6 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED pllmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKTRPRO TRACKTR LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Track Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKTRWHSTR TRACKTR LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Track Pants by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 RACKTRBLUE TRACKTR LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Track Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BBSHORTWHT BOXINGSHORT LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Ball Shorts by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BBSHORTRED BOXINGSHORT LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Dribbler Shorts by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BOXSHORT BOXINGSHORT LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Boxing Shorts by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SHELLSUITTR TRACKTR LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Leisure Pants T by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
 
    GOTO prolaps_menu
}

//------------------------------------------------------
{
plshoes_menu:
    DELETE_MENU 0

    LVAR_INT plshmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 plshmid
    SET_MENU_COLUMN plshmid 0 DUMMY plshr0 plshr1 plshr2 plshr3 plshr4 plshr5 plshr6 plshr7 plshr8 plshr9 DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 SHOES txt mdl
    SWITCH txt 
        case HITOP
            ACTIVATE_MENU_ITEM plshmid 0 0
        BREAK
        case CONVPROBLK
            ACTIVATE_MENU_ITEM plshmid 1 0
        BREAK 
        case CONVPROBLU
            ACTIVATE_MENU_ITEM plshmid 2 0
        BREAK
        case CONVPROGRN
            ACTIVATE_MENU_ITEM plshmid 3 0
        BREAK
        case SNEAKERPRORED
            ACTIVATE_MENU_ITEM plshmid 5 0
        BREAK        
        case SNEAKERPROBLU
            ACTIVATE_MENU_ITEM plshmid 4 0
        BREAK
        case SNEAKERPROWHT
            ACTIVATE_MENU_ITEM plshmid 6 0
        BREAK
        case BASK1PROWHT
            ACTIVATE_MENU_ITEM plshmid 7 0
        BREAK
        case BASK1PROBLK
            ACTIVATE_MENU_ITEM plshmid 8 0
        BREAK
        case BOXINGSHOE
            ACTIVATE_MENU_ITEM plshmid 9 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED plshmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HITOP BASK1 SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Mid-Top Sneaker by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CONVPROBLK CONV SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Hi-Tops by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CONVPROBLU CONV SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Hi-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CONVPROGRN CONV SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Hi-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERPRORED SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Red Sneakers by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERPROBLU SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Sneakers by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERPROWHT SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave White Sneakers by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASK1PROWHT BASK1 SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave White Mid-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASK1PROBLK BASK1 SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Mid-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BOXINGSHOE BIKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Boxing Shoes by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
 
    GOTO prolaps_menu
}