package com.linuxjet.lib.isy.entity.base;

import java.util.Vector;

/**
 * Created by jamespet on 10/15/15.
 */
public class Scene implements Comparable<Scene> {

  public static int CONTROLLER = 16;
  public static int RESPONDER = 32;
  private String Name;
  private String CustomName;
  private String Address;
  private String ElkID;
  private String Group;
  private String Flag;
  private String Folder;
  private Boolean Enabled = false;
  private Vector<String> controllers;
  private Vector<String> responders;

  public Scene() {
    controllers = new Vector<>();
    responders = new Vector<>();
  }

  public Scene(Scene scene) {
    setName(scene.getName());
    setAddress(scene.getAddress());
    setElkID(scene.getElkID());
    setEnabled(scene.getEnabled());
    setFlag(scene.getFlag());
    setGroup(scene.getGroup());
    setResponders(scene.getResponders());
    setControllers(scene.getControllers());
    setCustomName(scene.getCustomName());
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public String getElkID() {
    return ElkID;
  }

  public void setElkID(String elkID) {
    ElkID = elkID;
  }

  public String getFlag() {
    return Flag;
  }

  public void setFlag(String flag) {
    Flag = flag;
  }

  public void setFolder(String folder) {
    Folder = folder;
  }

  public String getFolder() {
    return Folder;
  }
  public String getGroup() {
    return Group;
  }

  public void setGroup(String group) {
    Group = group;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getCustomName() {
    if (CustomName == null) return getName();
    return CustomName;
  }

  public void setCustomName(String name) {
    CustomName = name;
  }

  public Boolean getEnabled() {
    return Enabled;
  }

  public void setEnabled(Boolean enabled) {
    Enabled = enabled;
  }

  public void addResponder(String memb) {
    responders.add(memb);
  }
  public void addController(String memb) {
    controllers.add(memb);
  }

  public Vector<String> getResponders() {
    return responders;
  }
  public Vector<String> getControllers() {
    return controllers;
  }

  public void setResponders(Vector<String> mbrs) {
    responders = mbrs;
  }
  public void setControllers(Vector<String> mbrs) {
    controllers = mbrs;
  }

  @Override
  public String toString() {
    return "Name:" + getName() + " | Addr:" + getAddress() + " | Scene:" + getGroup() + " | Flag:" + getFlag() + " | ElkID:" + getElkID();
  }

  @Override
  public int compareTo(Scene another) {
    if (getName() == null || getName().equals("")) return 1;
    if (another.getName() == null || another.getName().equals("")) return -1;
    if (getName().substring(0,getName().indexOf(".") + 1).compareTo(another.getName().substring(0,another.getName().indexOf(".") + 1)) == 0) {
      return getName().compareTo(another.getName());
    }
    return getName().compareTo(another.getName());

  }
}
