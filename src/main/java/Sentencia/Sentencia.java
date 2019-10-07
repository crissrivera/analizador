package Sentencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 * Interface que representa una Sentencia resultado de una analisis gramatical.
 *
 * @author GABRIELA
 */
public abstract class Sentencia implements TreeNode {

  protected Sentencia root;

  protected List<Sentencia> hijos;

  public abstract List<Sentencia> llenarHijos();

  public List<Sentencia> getHijos() {
    if (hijos == null) {
      llenarHijos();
    }
    return hijos;
  }

  public abstract String toString();

  @Override
  public TreeNode getChildAt(int childIndex) {
    return getHijos().get(childIndex);
  }

  @Override
  public int getChildCount() {
    return getHijos().size();
  }

  @Override
  public TreeNode getParent() {
    return root;
  }

  @Override
  public int getIndex(TreeNode node) {
    return getHijos().indexOf(node);
  }

  @Override
  public boolean getAllowsChildren() {
    return true;
  }

  @Override
  public boolean isLeaf() {
    if (getHijos() == null) {
      return true;
    }
    return getHijos().isEmpty();
  }

  @Override
  public Enumeration children() {
    return Collections.enumeration(hijos);
  }

 
  public void setHijos(List<Sentencia> hijos) {
    this.hijos = hijos;
  }

  public abstract String parse();

}
