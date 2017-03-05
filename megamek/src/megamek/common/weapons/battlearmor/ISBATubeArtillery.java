/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Oct 20, 2004
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.AmmoType;
import megamek.common.TechAdvancement;
import megamek.common.weapons.ArtilleryWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISBATubeArtillery extends ArtilleryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -2803991494958411097L;

    /**
     *
     */
    public ISBATubeArtillery() {
        super();
        name = "BA Tube Artillery";
        setInternalName("ISBATubeArtillery");
        rackSize = 3;
        ammoType = AmmoType.T_BA_TUBE;
        shortRange = 2;
        mediumRange = 2;
        longRange = 2;
        extremeRange = 2; // No extreme range.
        tonnage = 0.5;
        criticals = 4;
        bv = 27;
        cost = 200000;
        rulesRefs = "284, TO";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3065, 3075, DATE_NONE);
        techAdvancement.setTechRating(RATING_E);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_E });
    }

}
