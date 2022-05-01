package progtech.AbstractBuildingFactory;

import progtech.entities.*;


public class AllyBarackFactory extends BuildingFactory
{
    @Override
    public Building CreateBuilding(Player p) {
        if(p.getOwnedUnits().size() >0) {
            return new AllyBarack();
        }
        else
        {
            return null;
        }
    }
}
