/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package megamek.common.weapons.srms;

/**
 * @author Sebastian Brocks
 */
public class ISSRM4IOS extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -6674141690237272868L;

    /**
     *
     */
    public ISSRM4IOS() {
        super();
        name = "SRM 4 (I-OS)";
        setInternalName("ISSRM4IOS");
        addLookupName("ISSRM4 (IOS)"); // mtf
        addLookupName("IS SRM 4 (IOS)"); // tdb
        addLookupName("IOS SRM-4"); // mep
        heat = 3;
        rackSize = 4;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        tonnage = 1.5;
        criticals = 1;
        bv = 8;
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT);
        cost = 48000;
        shortAV = 4;
        maxRange = RANGE_SHORT;
        rulesRefs = "327,TO";
        techAdvancement.setTechBase(TECH_BASE_IS)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_B)
            .setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setISAdvancement(3056, 3081, 3085, DATE_NONE, DATE_NONE)
            .setISApproximate(false, true, false,false, false)
            .setPrototypeFactions(F_DC)
            .setProductionFactions(F_DC);
    }
}
