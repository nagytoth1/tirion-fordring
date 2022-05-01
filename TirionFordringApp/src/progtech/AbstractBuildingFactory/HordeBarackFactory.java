package progtech.AbstractBuildingFactory;

import progtech.entities.*;

public class HordeBarackFactory extends BuildingFactory
{
    @Override
    public Building CreateBuilding(Player p) {
        if(p.getOwnedUnits().size() >0) {
            return new HordeBarack();
        }
        else
        {
            return null;
        }
    }
}
