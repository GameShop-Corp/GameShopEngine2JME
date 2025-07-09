package com.mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector4f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;
import com.jme3.texture.Texture2D;
import com.mygame.graphics.Loxel;
//import com.mygame.loxel.Loxel;
/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);
        Loxel loxel = new Loxel("Loxel", 1920, 1080);
        loxel.layer.drawCircle(960, 540, 50, new Vector4f(0,0,255,255));
        Quad q = new Quad(19.2f, 10.8f);
        Geometry geom = new Geometry("Quad", q);
        geom.move(-9.6f, -5.4f, 0);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.White);
        mat.setTexture("ColorMap", new Texture2D(loxel.makeATMS()));
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}

