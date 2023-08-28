package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;

    public ModelStore(List<iModelChangeObserver> changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.flashes = new ArrayList<Flash>();
        this.scenes = new ArrayList<Scene>();
        this.cameras = new ArrayList<Camera>();
    }

    public Scene getScena(int index) {
        return this.scenes.get(index);
    }

    @Override
    public void notifyChange(iModelChanger sender) {
        // TODO Auto-generated method stub
        
    }
}
