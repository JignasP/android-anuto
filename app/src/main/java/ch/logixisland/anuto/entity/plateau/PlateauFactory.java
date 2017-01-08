package ch.logixisland.anuto.entity.plateau;

import ch.logixisland.anuto.util.GenericFactory;
import ch.logixisland.anuto.util.data.PlateauDescriptor;

public class PlateauFactory {

    private final GenericFactory<Plateau> mFactory;

    public PlateauFactory() {
        mFactory = new GenericFactory<>();
        mFactory.registerClass(BasicPlateau.class);
    }

    public Plateau createPlateau(String name) {
        return mFactory.createInstance(name);
    }

}
