class AnnalynsInfiltration {

    static boolean canFastAttack(boolean knightAwake) {
        return knightAwake==!true;
    }

    static boolean canSpy(boolean knightAwake, boolean archerAwake, boolean prisonerAwake) {
        return knightAwake== !false || archerAwake== !false || prisonerAwake== !false;
    }
    

    static boolean canSignalPrisoner(boolean archerAwake, boolean prisonerAwake) {
        return archerAwake == false && prisonerAwake == true;
    }

    static boolean canFreePrisoner(boolean knightAwake, boolean archerAwake, boolean prisonerAwake, boolean petDogPresent) {
        if (petDogPresent) {
            return  archerAwake == false;
        } else {
            return knightAwake == false && archerAwake == false && prisonerAwake == true;
        }
    }
}
