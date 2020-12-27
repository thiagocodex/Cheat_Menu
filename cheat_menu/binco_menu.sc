{
binco_menu:
    DELETE_MENU 0
    LVAR_INT bmid selected 
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bmid
    SET_MENU_COLUMN bmid 0 DUMMY torso legs shoes shades watches chains hats DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER WARDH3

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED bmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO bintorso_menu
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binlegs_menu
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binshoes_menu
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binglasses_menu
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binwatches_menu
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binchains_menu
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO binhats_menu
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO apparel_menu
}

{
bintorso_menu:
    DELETE_MENU 0

    LVAR_INT btmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 btmid
    SET_MENU_COLUMN btmid 0 DUMMY btr0 btr1 btr2 btr3 btr4 btr5 btr6 btr7 btr8 btr9 btr10 btr11
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 TORSO txt mdl
    SWITCH txt 
        case VEST
            ACTIVATE_MENU_ITEM btmid 0 0
        BREAK
        case VESTBLACK
            ACTIVATE_MENU_ITEM btmid 1 0
        BREAK 
        case HOODYAGREEN
            ACTIVATE_MENU_ITEM btmid 2 0
        BREAK
        case TSHIRTWHITE
            ACTIVATE_MENU_ITEM btmid 3 0
        BREAK
        case TSHIRTILOVELS
            ACTIVATE_MENU_ITEM btmid 4 0
        BREAK
        case TSHIRTBLUNTS
            ACTIVATE_MENU_ITEM btmid 5 0
        BREAK
        case SHIRTBGANG
            ACTIVATE_MENU_ITEM btmid 6 0
        BREAK
        case SHIRTBCHECK
            ACTIVATE_MENU_ITEM btmid 7 0
        BREAK
        case FIELD
            ACTIVATE_MENU_ITEM btmid 8 0
        BREAK
            case TSHIRTERISYELL
            ACTIVATE_MENU_ITEM btmid 9 0
        BREAK
        case TSHIRTERISORN
            ACTIVATE_MENU_ITEM btmid 10 0
        BREAK      
        case TRACKYTOP2ERIS
            ACTIVATE_MENU_ITEM btmid 11 0
        BREAK 
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED btmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 VEST VEST TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave White Tank by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 VESTBLACK VEST TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Tank by cheat"
                    GOTO ok_go_to_main
                 ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HOODYAGREEN HOODYA TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Hoody by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTWHITE TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave White T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTILOVELS TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave L.S. T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTBLUNTS TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Sharps T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SHIRTBGANG SHIRTB TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SHIRTBCHECK SHIRTB TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Checkered Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 FIELD FIELD TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Combat Jacket by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTERISYELL TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Eris T-Shirt by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TSHIRTERISORN TSHIRT TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Eris T-Shirt2 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKYTOP2ERIS TRACKYTOP1 TORSO
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Track Top by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
 
    GOTO binco_menu
}

{
binlegs_menu:
    DELETE_MENU 0

    LVAR_INT blmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 blmid
    SET_MENU_COLUMN blmid 0 DUMMY blr0 blr1 blr2 blr3 blr4 blr5 blr6 blr7 blr8 blr9 blr10 blr11
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 LEGS txt mdl
    SWITCH txt
        case LEGSBLACK
            ACTIVATE_MENU_ITEM blmid 0 0
        BREAK
        case LEGSHEART
            ACTIVATE_MENU_ITEM blmid 1 0
        BREAK
        case WORKTRCAMOGRN
            ACTIVATE_MENU_ITEM blmid 2 0
        BREAK
        case WORKTRCAMOGRY
            ACTIVATE_MENU_ITEM blmid 3 0
        BREAK
        case WORKTRGREY
            ACTIVATE_MENU_ITEM blmid 4 0
        BREAK
        case WORKTRKHAKI
            ACTIVATE_MENU_ITEM blmid 5 0
        BREAK
        case TRACKTR
            ACTIVATE_MENU_ITEM blmid 6 0
        BREAK
        case JEANSDENIM
            ACTIVATE_MENU_ITEM blmid 7 0
        BREAK
        case TRACKTRERIS
            ACTIVATE_MENU_ITEM blmid 8 0
        BREAK
        case BIEGETR
            ACTIVATE_MENU_ITEM blmid 9 0
        BREAK
        case DENIMSGANG
            ACTIVATE_MENU_ITEM blmid 10 0
        BREAK
        case TRACKTRGANG
            ACTIVATE_MENU_ITEM blmid 11 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED blmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 LEGSBLACK LEGS LEGS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Boxers by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 LEGSHEART LEGS 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Heart Boxers by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WORKTRCAMOGRN WORKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Woodland Camo by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WORKTRCAMOGRY WORKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Urban Camo by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WORKTRGREY WORKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Gray Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WORKTRKHAKI WORKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Olive Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKTR TRACKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Sweat Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 JEANSDENIM JEANS 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Jeans by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKTRERIS TRACKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Track Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BIEGETR CHINOSB 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Beije Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 DENIMSGANG JEANS 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Jeans by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 TRACKTRGANG TRACKTR 2
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Grn Track Pants by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO binco_menu
}

{
binshoes_menu:
    DELETE_MENU 0

    LVAR_INT bsmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bsmid
    SET_MENU_COLUMN bsmid 0 DUMMY bsr0 bsr1 bsr2 bsr3 bsr4 bsr5 bsr6 bsr7 bsr8 DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 SHOES txt mdl
    SWITCH txt
        case SANDAL
            ACTIVATE_MENU_ITEM bsmid 0 0
        BREAK
        case SANDALSOCK
            ACTIVATE_MENU_ITEM bsmid 1 0
        BREAK
        case FLIPFLOP
            ACTIVATE_MENU_ITEM bsmid 2 0
        BREAK
        case COWBOYBOOT
            ACTIVATE_MENU_ITEM bsmid 3 0
        BREAK
        case BASK2SEMI
            ACTIVATE_MENU_ITEM bsmid 4 0
        BREAK
        case BASK1ERIS
            ACTIVATE_MENU_ITEM bsmid 5 0
        BREAK
        case SNEAKERBINCGANG
            ACTIVATE_MENU_ITEM bsmid 6 0
        BREAK
        case SNEAKERBINCBLU
            ACTIVATE_MENU_ITEM bsmid 7 0
        BREAK
        case SNEAKERBINCBLK
            ACTIVATE_MENU_ITEM bsmid 8 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED bsmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SANDAL FLIPFLOP SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Sandals by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SANDALSOCK FLIPFLOP SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Sandal & Socks by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 FLIPFLOP FLIPFLOP SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Flip-Flops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 COWBOYBOOT BIKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Cowboy Boots by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASK2SEMI BASK1 SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Hi-Top Kicks by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BASK1ERIS BASK1 SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Hi-Top Sneaks by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERBINCGANG SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Low-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERBINCBLU SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Low-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 SNEAKERBINCBLK SNEAKER SHOES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Low-Tops by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO binco_menu
}

{
binglasses_menu:
    DELETE_MENU 0

    LVAR_INT bgmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bgmid
    SET_MENU_COLUMN bgmid 0 DUMMY bgr0 bgr1 bgr2 bgr3 bgr4 bgr5 bgr6 DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 GLASSES txt mdl
    SWITCH txt
        case GROUCHO
            ACTIVATE_MENU_ITEM bgmid 0 0
        BREAK
        case ZORRO
            ACTIVATE_MENU_ITEM bgmid 1 0
        BREAK
        case EYEPATCH
            ACTIVATE_MENU_ITEM bgmid 2 0
        BREAK
        case BANDRED3
            ACTIVATE_MENU_ITEM bgmid 3 0
        BREAK
        case BANDBLUE3
            ACTIVATE_MENU_ITEM bgmid 4 0
        BREAK
        case BANDGANG3
            ACTIVATE_MENU_ITEM bgmid 5 0
        BREAK
        case BANDBLACK3
            ACTIVATE_MENU_ITEM bgmid 6 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED bgmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 GROUCHO GROUCHOS GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Joke Glasses by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 ZORRO ZORROMASK GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Joke Mask by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 EYEPATCH EYEPATCH GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Eyepatch by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDRED3 BANDMASK GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Red Rag by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLUE3 BANDMASK GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Rag by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDGANG3 BANDMASK GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Rag by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLACK3 BANDMASK GLASSES
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Rag by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO binco_menu
}


{
binwatches_menu:
    DELETE_MENU 0

    LVAR_INT bwmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bwmid
    SET_MENU_COLUMN bwmid 0 DUMMY bwr0 bwr1 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 BRACELET_WATCH txt mdl
    SWITCH txt
        case WATCHPINK
            ACTIVATE_MENU_ITEM bwmid 0 0
        BREAK
        case WATCHYELLOW
            ACTIVATE_MENU_ITEM bwmid 1 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED bwmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WATCHPINK WATCH BRACELET_WATCH
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Pink Watch by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 WATCHYELLOW WATCH BRACELET_WATCH
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Yellow Watch by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE

    GOTO binco_menu
}

{
binchains_menu:
    DELETE_MENU 0

    LVAR_INT bnmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bnmid
    SET_MENU_COLUMN bnmid 0 DUMMY bnr0 bnr1 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 NECKLACE txt mdl
    SWITCH txt
        case DOGTAG
            ACTIVATE_MENU_ITEM bnmid 0 0
        BREAK
        case NECKAFRICA
            ACTIVATE_MENU_ITEM bnmid 1 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED bnmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 DOGTAG NECK NECKLACE
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Dogtags by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 NECKAFRICA NECK NECKLACE
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Africa Pendant by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE

    GOTO binco_menu
}

{
binhats_menu:
    DELETE_MENU 0

    LVAR_INT bhmid selected txt mdl
    CREATE_MENU amn 210.0 100.0 200.0 1 TRUE TRUE 0 bhmid
    SET_MENU_COLUMN bhmid 0 DUMMY bhr0 bhr1 bhr2 bhr3 bhr4 bhr5 bhr6 bhr7 bhr8 bhr9 bhr10 bhr11
    PRINT_HELP_FOREVER CLOTHB

    GET_CLOTHES_ITEM 0 HATS txt mdl
    SWITCH txt
        case BANDRED
            ACTIVATE_MENU_ITEM bhmid 0 0
        BREAK
        case BANDBLUE
            ACTIVATE_MENU_ITEM bhmid 1 0
        BREAK
        case BANDGANG
            ACTIVATE_MENU_ITEM bhmid 2 0
        BREAK
        case BANDBLACK
            ACTIVATE_MENU_ITEM bhmid 3 0
        BREAK
        case BANDRED2
            ACTIVATE_MENU_ITEM bhmid 4 0
        BREAK
        case BANDBLUE2
            ACTIVATE_MENU_ITEM bhmid 5 0
        BREAK
        case BANDBLACK2
            ACTIVATE_MENU_ITEM bhmid 6 0
        BREAK
        case BANDGANG2
            ACTIVATE_MENU_ITEM bhmid 7 0
        BREAK
        case CAPKNITGRN
            ACTIVATE_MENU_ITEM bhmid 8 0
        BREAK
        case CAPTRUCK
            ACTIVATE_MENU_ITEM bhmid 9 0
        BREAK
        case COWBOY
            ACTIVATE_MENU_ITEM bhmid 10 0
        BREAK
        case HATTIGER
            ACTIVATE_MENU_ITEM bhmid 11 0
        BREAK
    ENDSWITCH

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED bhmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDRED BANDANA HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Red Rag Back cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLUE BANDANA HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Rag Back by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDGANG BANDANA HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Rag Back by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLACK BANDANA HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Rag Back by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDRED2 BANDKNOTS HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Red Rag Front by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLUE2 BANDKNOTS HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Blue Rag Front by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDBLACK2 BANDKNOTS HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Black Rag Front by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 BANDGANG2 BANDKNOTS HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Green Rag Front by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CAPKNITGRN CAPKNIT HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Watch Cap by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 CAPTRUCK CAPTRUCK HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Trucker Hat by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 COWBOY COWBOY HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Cowboy Hat by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GIVE_PLAYER_CLOTHES 0 HATTIGER COWBOY HATS
                    BUILD_PLAYER_MODEL 0
                    PRINT_HELP_STRING "Gave Leopard Cowboy by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO binco_menu
}
