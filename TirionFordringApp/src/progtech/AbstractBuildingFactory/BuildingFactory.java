package progtech.AbstractBuildingFactory;

import progtech.entities.*;

import java.sql.Connection;


public abstract class BuildingFactory
{

    public abstract Building CreateBuilding(Player p);
}
