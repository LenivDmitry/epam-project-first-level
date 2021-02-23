package services;

import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.Plane;
import models.ClassificationLevel;
import models.MilitaryType;

import java.util.List;

public class ServiceForTests {
    public boolean checkMilitaryTypeIsTransport(List<MilitaryPlane> transportMilitaryPlanes) {
        boolean isMilitaryTypeTransport = false;
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getMilitaryType() == MilitaryType.TRANSPORT)) {
                isMilitaryTypeTransport = true;
                break;
            }
        }
        return isMilitaryTypeTransport;
    }

    public boolean isRightSortByMaxLoadCapacity(List<? extends Plane> planesSortedByMaxLoadCapacity) {
        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        return nextPlaneMaxLoadCapacityIsHigherThanCurrent;
    }

    public boolean isBomberInMilitaryPlanes(List<MilitaryPlane> bomberMilitaryPlanes) {
        boolean isPlaneBomberType = false;
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getMilitaryType() == MilitaryType.BOMBER)) {
                isPlaneBomberType = true;
            }
        }
        return isPlaneBomberType;
    }

    public boolean hasUnclassifiedLevelInExperimentalPlanes(List<ExperimentalPlane> experimentalPlanes) {
        boolean hasUnclassifiedPlanes = false;
        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
            if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
                hasUnclassifiedPlanes = true;
                break;
            }
        }
        return hasUnclassifiedPlanes;
    }
}
