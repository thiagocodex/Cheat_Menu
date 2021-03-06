SCRIPT_START

REQUIRE player_menu.sc
REQUIRE apparel_menu.sc
REQUIRE binco_menu.sc
REQUIRE prolaps_menu.sc
REQUIRE vehicle_spawner_menu.sc
REQUIRE vehicles_menu.sc
REQUIRE vehicles.sc
REQUIRE suburban_menu.sc
REQUIRE player_stats_menu.sc
REQUIRE barber_shop_menu.sc


ADD_TEXT_LABEL cmn "Cheat Menu"
ADD_TEXT_LABEL pmn "Player"
ADD_TEXT_LABEL amn "Apparel"
ADD_TEXT_LABEL psmn "Player Stats"

ADD_TEXT_LABEL cmh "Use ~u~ and ~d~ to navigate the cheat menu.~n~~k~~PED_SPRINT~ Select~n~~k~~VEHICLE_ENTER_EXIT~ Back"
ADD_TEXT_LABEL pmh "Use ~u~ and ~d~ to select an item.~N~~k~~PED_SPRINT~ Choose~N~~k~~VEHICLE_ENTER_EXIT~ Back"
ADD_TEXT_LABEL amh "Use ~u~ and ~d~ to select a shop.~N~~k~~PED_SPRINT~ Choose~N~~k~~VEHICLE_ENTER_EXIT~ Back"
ADD_TEXT_LABEL vmh "Use ~u~ and ~d~ to select a vehicle.~N~~k~~PED_SPRINT~ Spawn Car~N~~k~~VEHICLE_ENTER_EXIT~ Back"

ADD_TEXT_LABEL bmn "Binco"
ADD_TEXT_LABEL plmn "Pro-Laps"
ADD_TEXT_LABEL sumn "Sub Urban"

ADD_TEXT_LABEL vsmn "Vehicle Spawner"
ADD_TEXT_LABEL vsauxmn "Vehicle-Spawner"
ADD_TEXT_LABEL chauxmn "Coupe-Hatch"
ADD_TEXT_LABEL crmn "Cars"

//clothes category
ADD_TEXT_LABEL torso "Torso"
ADD_TEXT_LABEL legs "Legs"
ADD_TEXT_LABEL shoes "Shoes"
ADD_TEXT_LABEL shades "Shades"
ADD_TEXT_LABEL watches "Watches"
ADD_TEXT_LABEL chains "Chains"
ADD_TEXT_LABEL hats "Hats"

//binco torso
ADD_TEXT_LABEL btr0 "White Tank"
ADD_TEXT_LABEL btr1 "Black Tank"
ADD_TEXT_LABEL btr2 "Green Hoody"
ADD_TEXT_LABEL btr3 "White T-Shirt"
ADD_TEXT_LABEL btr4 "L.S. T-Shirt"
ADD_TEXT_LABEL btr5 "Sharps T-Shirt"
ADD_TEXT_LABEL btr6 "Green Shirt"
ADD_TEXT_LABEL btr7 "Checkered Shirt"
ADD_TEXT_LABEL btr8 "Combat Jacket"
ADD_TEXT_LABEL btr9 "Eris T-Shirt"
ADD_TEXT_LABEL btr10 "Eris T-Shirt2"
ADD_TEXT_LABEL btr11 "Track Top"

//binco legs
ADD_TEXT_LABEL blr0 "Black Boxers"
ADD_TEXT_LABEL blr1 "Heart Boxers"
ADD_TEXT_LABEL blr2 "Woodland Camo"
ADD_TEXT_LABEL blr3 "Urban Camo"
ADD_TEXT_LABEL blr4 "Gray Pants"
ADD_TEXT_LABEL blr5 "Olive Pants"
ADD_TEXT_LABEL blr6 "Sweat Pants"
ADD_TEXT_LABEL blr7 "Blue Jeans"
ADD_TEXT_LABEL blr8 "Track Pants"
ADD_TEXT_LABEL blr9 "Beije Pants"
ADD_TEXT_LABEL blr10 "Green Jeans"
ADD_TEXT_LABEL blr11 "Grn Track Pants"

//binco shoes
ADD_TEXT_LABEL bsr0 "Sandals"
ADD_TEXT_LABEL bsr1 "Sandal & Socks"
ADD_TEXT_LABEL bsr2 "Flip-Flops"
ADD_TEXT_LABEL bsr3 "Cowboy Boots"
ADD_TEXT_LABEL bsr4 "Hi-Top Kicks"
ADD_TEXT_LABEL bsr5 "Hi-Top Sneaks"
ADD_TEXT_LABEL bsr6 "Green Low-Tops"
ADD_TEXT_LABEL bsr7 "Blue Low-Tops"
ADD_TEXT_LABEL bsr8 "Black Low-Tops"

//binco glasses
ADD_TEXT_LABEL bgr0 "Joke Glasses"
ADD_TEXT_LABEL bgr1 "Joke Mask"
ADD_TEXT_LABEL bgr2 "Eyepatch"
ADD_TEXT_LABEL bgr3 "Red Rag"
ADD_TEXT_LABEL bgr4 "Blue Rag"
ADD_TEXT_LABEL bgr5 "Green Rag"
ADD_TEXT_LABEL bgr6 "Black Rag"

//binco watches
ADD_TEXT_LABEL bwr0 "Pink Watch"
ADD_TEXT_LABEL bwr1 "Yellow Watch"

//binco necklaces
ADD_TEXT_LABEL bnr0 "Dogtags"
ADD_TEXT_LABEL bnr1 "Africa Pendant"

//binco hats
ADD_TEXT_LABEL bhr0 "Red Rag Back"
ADD_TEXT_LABEL bhr1 "Blue Rag Back"
ADD_TEXT_LABEL bhr2 "Green Rag Back"
ADD_TEXT_LABEL bhr3 "Black Rag Back"
ADD_TEXT_LABEL bhr4 "Red Rag Front"
ADD_TEXT_LABEL bhr5 "Blue Rag Front"
ADD_TEXT_LABEL bhr6 "Black Rag Front"
ADD_TEXT_LABEL bhr7 "Green Rag Front"
ADD_TEXT_LABEL bhr8 "Watch Cap"
ADD_TEXT_LABEL bhr9 "Trucker Hat"
ADD_TEXT_LABEL bhr10 "Cowboy Hat"
ADD_TEXT_LABEL bhr11 "Leopard Cowboy"

//pro-laps torso
ADD_TEXT_LABEL pltr0 "Rimmers Jacket"
ADD_TEXT_LABEL pltr1 "R-Star Jacket"
ADD_TEXT_LABEL pltr2 "Dribblers Vest"
ADD_TEXT_LABEL pltr3 "Saint's Shirt"
ADD_TEXT_LABEL pltr4 "69ers T-Shirt"
ADD_TEXT_LABEL pltr5 "ProLaps T-Shirt"
ADD_TEXT_LABEL pltr6 "ProLaps Black T"
ADD_TEXT_LABEL pltr7 "Bandits Top"
ADD_TEXT_LABEL pltr8 "Track Top"
ADD_TEXT_LABEL pltr9 "Leisure Top"
ADD_TEXT_LABEL pltr10 "Slappers Top"
ADD_TEXT_LABEL pltr11 "Baseball T"

//pro-laps legs
ADD_TEXT_LABEL pllr0 "Track Pants"
ADD_TEXT_LABEL pllr1 "Black Track Pants"
ADD_TEXT_LABEL pllr2 "Blue Track Pants"
ADD_TEXT_LABEL pllr3 "Ball Shorts"
ADD_TEXT_LABEL pllr4 "Boxing Shorts"
ADD_TEXT_LABEL pllr5 "Dribbler Shorts"
ADD_TEXT_LABEL pllr6 "Leisure Pants"

//pro-laps shoes
ADD_TEXT_LABEL plshr0 "Mid-Top Sneaker"
ADD_TEXT_LABEL plshr1 "Black Hi-Tops"
ADD_TEXT_LABEL plshr2 "Blue Hi-Tops"
ADD_TEXT_LABEL plshr3 "Green Hi-Tops"
ADD_TEXT_LABEL plshr4 "Red Sneaker"
ADD_TEXT_LABEL plshr5 "Blue Sneaker"
ADD_TEXT_LABEL plshr6 "White Sneaker"
ADD_TEXT_LABEL plshr7 "White Mid-Tops"
ADD_TEXT_LABEL plshr8 "Black Mid-Tops"
ADD_TEXT_LABEL plshr9 "Boxing Shoes"

//sub urban torso
ADD_TEXT_LABEL sutr0 "White Heat T"
ADD_TEXT_LABEL sutr1 "Bobo Ape T"
ADD_TEXT_LABEL sutr2 "Red Bobo T"
ADD_TEXT_LABEL sutr3 "Base 5 T"
ADD_TEXT_LABEL sutr4 "Suburban T"
ADD_TEXT_LABEL sutr5 "Mercury Hood"
ADD_TEXT_LABEL sutr6 "Base 5 Hood"
ADD_TEXT_LABEL sutr7 "Rockstar Hood"
ADD_TEXT_LABEL sutr8 "Vest & T-Shirt"
ADD_TEXT_LABEL sutr9 "Grn Windbreaker"
ADD_TEXT_LABEL sutr10 "Blk Windbreaker"
ADD_TEXT_LABEL sutr11 "Rockstar Sweat"


/////////////////////////////////////////////
ADD_TEXT_LABEL vspag1 "Vehicle Spawner 1"
ADD_TEXT_LABEL vspag2 "Vehicle Spawner 2"

ADD_TEXT_LABEL veh1 "Vehicles 1"
ADD_TEXT_LABEL veh2 "Vehicles 2"
ADD_TEXT_LABEL veh3 "Vehicles 3"
ADD_TEXT_LABEL veh4 "Vehicles 4"
ADD_TEXT_LABEL veh5 "Vehicles 5"
ADD_TEXT_LABEL veh6 "Vehicles 6"
ADD_TEXT_LABEL veh7 "Vehicles 7"
ADD_TEXT_LABEL veh8 "Vehicles 8"
ADD_TEXT_LABEL veh9 "Vehicles 9"
ADD_TEXT_LABEL veh10 "Vehicles 10"
ADD_TEXT_LABEL veh11 "Vehicles 11"
ADD_TEXT_LABEL veh12 "Vehicles 12"
ADD_TEXT_LABEL veh13 "Vehicles 13"
ADD_TEXT_LABEL veh14 "Vehicles 14"
ADD_TEXT_LABEL veh15 "Vehicles 15"
ADD_TEXT_LABEL veh16 "Vehicles 16"
ADD_TEXT_LABEL veh17 "Vehicles 17"


//vehicle category page 1
ADD_TEXT_LABEL acmn "Aircraft"
ADD_TEXT_LABEL boatmr "Boats"
ADD_TEXT_LABEL chbmr1 "Coupes & Hatchbacks 1"
ADD_TEXT_LABEL chbmr2 "Coupes & Hatchbacks 2"
ADD_TEXT_LABEL govmr "Government"
ADD_TEXT_LABEL indmr1 "Industrial"
ADD_TEXT_LABEL indmr2 "Industrial 2"
ADD_TEXT_LABEL lrmr "Lowriders"
ADD_TEXT_LABEL miscmr "Miscellaneous"
ADD_TEXT_LABEL mbmr "Motercycles & Bikes"
ADD_TEXT_LABEL novmr "Novelty"
ADD_TEXT_LABEL psmr "Public Service"
ADD_TEXT_LABEL rcmr "Remote Control"




//boats menu
ADD_TEXT_LABEL bomr0 "Coastguard"
ADD_TEXT_LABEL bomr1 "Dinghy"
ADD_TEXT_LABEL bomr2 "Jetmax"
ADD_TEXT_LABEL bomr3 "Launch"
ADD_TEXT_LABEL bomr4 "Marquis"
ADD_TEXT_LABEL bomr5 "Predator"
ADD_TEXT_LABEL bomr6 "Reefer"
ADD_TEXT_LABEL bomr7 "Speeder"
ADD_TEXT_LABEL bomr8 "Squalo"
ADD_TEXT_LABEL bomr9 "Tropic"


//coupes & hatchback


ADD_TEXT_LABEL chmr0 "Blista Compact"
ADD_TEXT_LABEL chmr1 "Bravura"
ADD_TEXT_LABEL chmr2 "Buccaneer"
ADD_TEXT_LABEL chmr3 "Cadrona"
ADD_TEXT_LABEL chmr4 "Clover"
ADD_TEXT_LABEL chmr5 "Club"
ADD_TEXT_LABEL chmr6 "Esperanto"
ADD_TEXT_LABEL chmr7 "Feltzer"
ADD_TEXT_LABEL chmr8 "Fortune"
ADD_TEXT_LABEL chmr9 "Hermes"
ADD_TEXT_LABEL chmr10 "Hustler"
ADD_TEXT_LABEL chmr11 "Majestic"
ADD_TEXT_LABEL chmr12 "Manana"
ADD_TEXT_LABEL chmr13 "Previon"
ADD_TEXT_LABEL chmr14 "Sabre"
ADD_TEXT_LABEL chmr15 "Stallion"
ADD_TEXT_LABEL chmr16 "Tampa"
ADD_TEXT_LABEL chmr17 "Virgo"

ADD_TEXT_LABEL acmnp1 "Aircraft 1"
ADD_TEXT_LABEL acmnp2 "Aircraft 2"

//aircraft menu 1
ADD_TEXT_LABEL acmr0 "Andromada"
ADD_TEXT_LABEL acmr1 "AT-400"
ADD_TEXT_LABEL acmr2 "Beagle"
ADD_TEXT_LABEL acmr3 "Cargobob"
ADD_TEXT_LABEL acmr4 "Cropduster"
ADD_TEXT_LABEL acmr5 "Dodo"
ADD_TEXT_LABEL acmr6 "Hunter"
ADD_TEXT_LABEL acmr7 "Hydra"
ADD_TEXT_LABEL acmr8 "Leviathan"
ADD_TEXT_LABEL acmr9 "Nevada"
ADD_TEXT_LABEL acmr10 "News Chopper"
ADD_TEXT_LABEL acmr11 "Maverick"
//aircraft menu 2

ADD_TEXT_LABEL acmr12 "Police Maverick"
ADD_TEXT_LABEL acmr13 "Raindance"
ADD_TEXT_LABEL acmr14 "Rustler"
ADD_TEXT_LABEL acmr15 "Sea Sparrow"
ADD_TEXT_LABEL acmr16 "Shamal"
ADD_TEXT_LABEL acmr17 "Skimmer"
ADD_TEXT_LABEL acmr18 "Sparrow"
ADD_TEXT_LABEL acmr19 "Stuntplane"

/////////////////////////////////////

ADD_TEXT_LABEL vrow0 "Admiral"
//ADD_TEXT_LABEL vrow1 "Airtrain"
ADD_TEXT_LABEL vrow2 "Alpha"
ADD_TEXT_LABEL vrow3 "Ambulance"
ADD_TEXT_LABEL vrow4 "Andromada"
ADD_TEXT_LABEL vrow5 "AT-400"
ADD_TEXT_LABEL vrow6 "Baggage Handler"
ADD_TEXT_LABEL vrow7 "Bandito"
ADD_TEXT_LABEL vrow8 "Banshee"
ADD_TEXT_LABEL vrow9 "Barracks"
ADD_TEXT_LABEL vrow10 "Beagle"
ADD_TEXT_LABEL vrow11 "Benson"
ADD_TEXT_LABEL vrow12 "Berkley's RC Van"


//fat stats
ADD_TEXT_LABEL fatmn "Fat"
ADD_TEXT_LABEL fatmr0 "Thin"
ADD_TEXT_LABEL fatmr1 "Skinny"
ADD_TEXT_LABEL fatmr2 "Normal"
ADD_TEXT_LABEL fatmr3 "Little Fat"
ADD_TEXT_LABEL fatmr4 "Fat"
ADD_TEXT_LABEL fatmr5 "Obese"


//muscle stats
ADD_TEXT_LABEL mscmn "Muscle"
ADD_TEXT_LABEL mscmr0 "Muscle 0"
ADD_TEXT_LABEL mscmr1 "Muscle 200"
ADD_TEXT_LABEL mscmr2 "Muscle 400"
ADD_TEXT_LABEL mscmr3 "Muscle 600"
ADD_TEXT_LABEL mscmr4 "Muscle 800"
ADD_TEXT_LABEL mscmr5 "Muscle 1000"

//vehicle options
ADD_TEXT_LABEL vmn "Vehicle"
ADD_TEXT_LABEL vomn "Vehicle-Options"
ADD_TEXT_LABEL vcmn "Vehicle Color 1"
ADD_TEXT_LABEL vcmn2 "Vehicle Color 2"

ADD_TEXT_LABEL vcwng "~r~You ain't in a car"


//barber shop
ADD_TEXT_LABEL bsmn "Barber Shop"
ADD_TEXT_LABEL hcsmn1 "Haircut Style 1"
ADD_TEXT_LABEL hcsmn2 "Haircut Style 2"
ADD_TEXT_LABEL hcsmn3 "Haircut Style 3"

ADD_TEXT_LABEL hcmr0 "Cesar"
ADD_TEXT_LABEL hcmr1 "Blonde Hair"
ADD_TEXT_LABEL hcmr2 "Pink Hair"
ADD_TEXT_LABEL hcmr3 "Blonde Afro"
ADD_TEXT_LABEL hcmr4 "Blonde Cornrow"
ADD_TEXT_LABEL hcmr5 "High Afro"
ADD_TEXT_LABEL hcmr6 "Wedge"
ADD_TEXT_LABEL hcmr7 "Detail Cut"
ADD_TEXT_LABEL hcmr8 "Groove Cut"
ADD_TEXT_LABEL hcmr9 "Mohawk"
ADD_TEXT_LABEL hcmr10 "Blonde Mohawk"
ADD_TEXT_LABEL hcmr11 "Pink Mohawk"

ADD_TEXT_LABEL hcmr12 "Red Hair"
ADD_TEXT_LABEL hcmr13 "Blue Hair"
ADD_TEXT_LABEL hcmr14 "Green Hair"
ADD_TEXT_LABEL hcmr15 "Bald Head"
ADD_TEXT_LABEL hcmr16 "Bald & Stash"
ADD_TEXT_LABEL hcmr17 "Bald & Goatee"
ADD_TEXT_LABEL hcmr18 "Cesar & Beard"
ADD_TEXT_LABEL hcmr19 "Slope"
ADD_TEXT_LABEL hcmr20 "Mohawk & Beard"
ADD_TEXT_LABEL hcmr21 "Elvis Hair"

ADD_TEXT_LABEL hcmr22 "Cesar & Stash"
ADD_TEXT_LABEL hcmr23 "Cesar & Goatee"
ADD_TEXT_LABEL hcmr24 "Cesar & Beard"
ADD_TEXT_LABEL hcmr25 "Afro"
ADD_TEXT_LABEL hcmr26 "Afro & Stash"
ADD_TEXT_LABEL hcmr27 "Afro & Goatee"
ADD_TEXT_LABEL hcmr28 "Afro & Beard"
ADD_TEXT_LABEL hcmr29 "FlatTop"
ADD_TEXT_LABEL hcmr30 "Jheri Curl"
ADD_TEXT_LABEL hcmr31 "Cornrow"
ADD_TEXT_LABEL hcmr32 "High Fade"


//remove clothes 
ADD_TEXT_LABEL rcmn "Remove Clothes"
ADD_TEXT_LABEL rcmr0 "Remove Torso"
ADD_TEXT_LABEL rcmr1 "Remove Legs"
ADD_TEXT_LABEL rcmr2 "Remove Shoes"
ADD_TEXT_LABEL rcmr3 "Remove Necklace"
ADD_TEXT_LABEL rcmr4 "Remove Watch"
ADD_TEXT_LABEL rcmr5 "Remove Glasses"
ADD_TEXT_LABEL rcmr6 "Remove Hat"
ADD_TEXT_LABEL rcmr7 "Remove Special Costume"



//wanted level
ADD_TEXT_LABEL wlmn "Wanted Level"
ADD_TEXT_LABEL wlmr0 "Clear wanted level"



{
ok_go_to_main:
    DELETE_MENU 0
    WAIT 100
    SET_PLAYER_CONTROL 0 TRUE
    GOTO main
}



{
main:
    WAIT 0
    LVAR_INT txt mdl time
    GET_GAME_TIMER time
    IF time <= 3000
        GIVE_PLAYER_CLOTHES 0 BBALLJACKRSTAR HOODYA TORSO
        GIVE_PLAYER_CLOTHES 0 DENIMSGANG JEANS LEGS
        GIVE_PLAYER_CLOTHES 0 SNEAKERBINCBLU SNEAKER SHOES
        GIVE_PLAYER_CLOTHES 0 CAPTRUCK CAPTRUCK HATS
        BUILD_PLAYER_MODEL 0
    ENDIF

    IF TEST_CHEAT "START"
        ADD_ONE_OFF_SOUND 0.0 0.0 0.0 45400
        GOTO test_sound
    ENDIF

     LVAR_INT player
    /*LVAR_FLOAT x y z
    GET_PLAYER_CHAR 0 player 
    GET_CHAR_COORDINATES player x y z
    PRINT_FORMATTED_NOW "%f %f %f" 0 x y z
    WAIT 0 */

    IF IS_BUTTON_PRESSED PAD1 LEFTSHOULDER1
    AND IS_BUTTON_PRESSED PAD1 RIGHTSHOULDER1
        
        GET_PLAYER_CHAR  0 player
        SET_CHAR_COORDINATES player 2492.0, -1664.0, 13.0
        PRINT_HELP_STRING "Teleportado"

        WHILE IS_BUTTON_PRESSED PAD1 LEFTSHOULDER1
        AND IS_BUTTON_PRESSED PAD1 RIGHTSHOULDER1
            WAIT 0
        ENDWHILE
    ENDIF 

    IF IS_BUTTON_PRESSED PAD1 CROSS
    AND IS_BUTTON_PRESSED PAD1 LEFTSHOULDER1
    AND IS_BUTTON_PRESSED PAD1 DPADRIGHT
        PRINT_HELP WARDH3
        WAIT 0
        GOTO cheat_menu
    ENDIF

    IF TEST_CHEAT "cheat"
        PRINT_HELP WARDH3
        WAIT 0
        GOTO cheat_menu
    ENDIF

    WHILE IS_KEY_PRESSED VK_LSHIFT
        GET_CLOTHES_ITEM 0 HEAD txt mdl
        PRINT_FORMATTED_NOW "TXT: %i MDL: %i" 1 txt mdl
        WAIT 0
    ENDWHILE


    LVAR_INT car carp read read2 status

    WHILE IS_BUTTON_PRESSED PAD1 DPADLEFT
    AND IS_BUTTON_PRESSED PAD1 CIRCLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 DPADRIGHT
    AND IS_BUTTON_PRESSED PAD1 CIRCLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 DPADLEFT
    AND IS_BUTTON_PRESSED PAD1 SQUARE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 DPADRIGHT
    AND IS_BUTTON_PRESSED PAD1 SQUARE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 DPADLEFT
        WAIT 0
        IF IS_BUTTON_PRESSED PAD1 SQUARE
            GET_PLAYER_CHAR 0 player
            GET_CAR_CHAR_IS_USING player car
            SET_CAR_ENGINE_BROKEN car TRUE
            PRINT_HELP_STRING "Engine off"
            GOTO main
        ELSE 
            IF IS_BUTTON_PRESSED PAD1 CIRCLE
                GET_PLAYER_CHAR 0 player
                GET_CAR_CHAR_IS_USING player car
                GET_VEHICLE_POINTER car carp
                IF IS_CHAR_IN_ANY_CAR player
                    carp+=1192
                    WRITE_MEMORY carp 1 8 0
                    ADD_ONE_OFF_SOUND 0.0 0.0 0.0 1150
                    PRINT_HELP_STRING "Lights off"
                    GOTO main
                ENDIF
            ENDIF
        ENDIF
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 DPADRIGHT
        WAIT 0
        IF IS_BUTTON_PRESSED PAD1 SQUARE
            GET_PLAYER_CHAR 0 player
            GET_CAR_CHAR_IS_USING player car
            SET_CAR_ENGINE_BROKEN car FALSE
            SET_CAR_ENGINE_ON car TRUE
            PRINT_HELP_STRING "Engine started"
            SET_PLAYER_CONTROL 0 FALSE
            WAIT 1000
            SET_PLAYER_CONTROL 0 TRUE
            GOTO main
        ELSE
            IF IS_BUTTON_PRESSED PAD1 CIRCLE
                GET_PLAYER_CHAR 0 player
                GET_CAR_CHAR_IS_USING player car
                GET_VEHICLE_POINTER car carp
                IF IS_CHAR_IN_ANY_CAR player
                    carp+=1192
                    READ_MEMORY carp 1 0 read
                    IF IS_INT_LVAR_EQUAL_TO_NUMBER read 8
                        WRITE_MEMORY carp 1 16 0
                        ADD_ONE_OFF_SOUND 0.0 0.0 0.0 1150
                        PRINT_HELP_STRING "Lights on"
                        GOTO main
                    ENDIF
                ENDIF
            ENDIF
        ENDIF
    ENDWHILE

    WHILE IS_KEY_PRESSED VK_RSHIFT
        PRINT_STRING_NOW "Script recarregado!" 1000
        STREAM_CUSTOM_SCRIPT  "cheat_menu.cs"
        TERMINATE_THIS_CUSTOM_SCRIPT
        WAIT 0
    ENDWHILE
    GOTO main



}

{
test_sound:
    LVAR_INT starts char
    LVAR_FLOAT x y z
    starts = 45400
    GET_PLAYER_CHAR 0 char
    GET_CHAR_COORDINATES char x y z
    WHILE NOT TEST_CHEAT "STOP"
        ADD_ONE_OFF_SOUND x y z starts
        PLAY_BEAT_TRACK 
        PRINT_FORMATTED_NOW "SOUND: %i" 5000 starts
        starts++
        IF starts = 1830
            starts = 2000
        ENDIF
    WAIT 5000
    ENDWHILE

}

{
cheat_menu:
    LVAR_INT cmid selected
    SET_PLAYER_CONTROL 0 FALSE
    CREATE_MENU cmn 210.0 100.0 200.0 1 TRUE TRUE 0 cmid
    SET_MENU_COLUMN cmid 0 DUMMY pmn vsmn vmn DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY DUMMY
    PRINT_HELP_FOREVER cmh

    WHILE IS_BUTTON_PRESSED PAD1 TRIANGLE
        WAIT 0
    ENDWHILE

    WHILE IS_BUTTON_PRESSED PAD1 CROSS
        WAIT 0
    ENDWHILE

    WHILE NOT IS_BUTTON_PRESSED PAD1 TRIANGLE
        GET_MENU_ITEM_SELECTED cmid selected
        SWITCH selected
            CASE 0
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO player_menu
                ENDIF
            BREAK
            CASE 1
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO vehicle_spawner_menu
                ENDIF
            BREAK
            CASE 2
                IF IS_BUTTON_PRESSED PAD1 CROSS
                    GOTO vehicle
                ENDIF
            BREAK
        ENDSWITCH
        WAIT 0
    ENDWHILE

    DELETE_MENU 0
    CLEAR_HELP
    WAIT 100
    SET_PLAYER_CONTROL 0 TRUE
    GOTO main
}
SCRIPT_END