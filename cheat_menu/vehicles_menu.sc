{
vehicle_page_1_menu:
    DELETE_MENU 0
    LVAR_INT crmid selected 
    CREATE_MENU vsmn 210.0 100.0 200.0 1 TRUE TRUE 0 crmid
    SET_MENU_COLUMN crmid 0 DUMMY veh1 veh2 veh3 veh4 veh5 veh6 veh7 veh8 veh9 veh10 veh11 veh12
    PRINT_HELP_FOREVER pmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED crmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO vehicles_menu
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO vehicle_spawner_menu
}

{
vehicle_page_2_menu:
    DELETE_MENU 0
    LVAR_INT crmid selected 
    CREATE_MENU vsmn 210.0 100.0 200.0 1 TRUE TRUE 0 crmid
    SET_MENU_COLUMN crmid 0 DUMMY veh13 veh14 veh15 veh16 veh17 DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER pmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED crmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    //GOTO
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO vehicle_spawner_menu
}

{
vehicles_menu:
    DELETE_MENU 0
    LVAR_INT crmid selected 
    CREATE_MENU vsmn 210.0 100.0 200.0 1 TRUE TRUE 0 crmid
    SET_MENU_COLUMN crmid 0 DUMMY vrow0 vrow2 vrow3 vrow4 vrow5 vrow6 vrow7 vrow8 vrow9 vrow10 vrow11 vrow12
    PRINT_HELP_FOREVER vmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE

        GET_MENU_ITEM_SELECTED crmid selected
        SWITCH selected
            case 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL ADMIRAL
                    SPAWN_VEHICLE_BY_CHEATING ADMIRAL
                    MARK_MODEL_AS_NO_LONGER_NEEDED ADMIRAL
                    //until I get it solved
                    PRINT_HELP_STRING "Spawned Admiral by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL ALPHA
                    SPAWN_VEHICLE_BY_CHEATING ALPHA
                    MARK_MODEL_AS_NO_LONGER_NEEDED ALPHA
                    PRINT_HELP_STRING "Spawned Alpha by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL AMBULAN
                    SPAWN_VEHICLE_BY_CHEATING AMBULAN
                    MARK_MODEL_AS_NO_LONGER_NEEDED AMBULAN
                    PRINT_HELP_STRING "Spawned Ambulance by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 3
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL ANDROM
                    SPAWN_VEHICLE_BY_CHEATING ANDROM
                    MARK_MODEL_AS_NO_LONGER_NEEDED ANDROM
                    PRINT_HELP_STRING "Spawned Andromada by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 4
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL AT400
                    SPAWN_VEHICLE_BY_CHEATING AT400
                    MARK_MODEL_AS_NO_LONGER_NEEDED AT400
                    PRINT_HELP_STRING "Spawned AT-400 by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 5
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BAGGAGE
                    SPAWN_VEHICLE_BY_CHEATING BAGGAGE
                    MARK_MODEL_AS_NO_LONGER_NEEDED BAGGAGE
                    PRINT_HELP_STRING "Spawned Baggage Handler by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 6
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BANDITO
                    SPAWN_VEHICLE_BY_CHEATING BANDITO
                    MARK_MODEL_AS_NO_LONGER_NEEDED BANDITO
                    PRINT_HELP_STRING "Spawned Bandito by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 7
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BANSHEE
                    SPAWN_VEHICLE_BY_CHEATING BANSHEE
                    MARK_MODEL_AS_NO_LONGER_NEEDED BANSHEE
                    PRINT_HELP_STRING "Spawned Banshee by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 8
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BARRACKS
                    SPAWN_VEHICLE_BY_CHEATING BARRACKS
                    MARK_MODEL_AS_NO_LONGER_NEEDED BARRACKS
                    PRINT_HELP_STRING "Spawned Barracks by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 9
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BEAGLE
                    SPAWN_VEHICLE_BY_CHEATING BEAGLE
                    MARK_MODEL_AS_NO_LONGER_NEEDED BEAGLE
                    PRINT_HELP_STRING "Spawned Beagle by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 10
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL BENSON
                    SPAWN_VEHICLE_BY_CHEATING BENSON
                    MARK_MODEL_AS_NO_LONGER_NEEDED BENSON
                    PRINT_HELP_STRING "Spawned Benson by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
            case 11
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    REQUEST_MODEL TOPFUN
                    SPAWN_VEHICLE_BY_CHEATING TOPFUN
                    MARK_MODEL_AS_NO_LONGER_NEEDED TOPFUN
                    PRINT_HELP_STRING "Spawned Berkley's RC Van by cheat"
                    GOTO ok_go_to_main
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE
    GOTO vehicle_page_1_menu
}