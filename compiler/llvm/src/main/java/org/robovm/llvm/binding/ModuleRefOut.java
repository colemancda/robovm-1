/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.llvm.binding;

public class ModuleRefOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModuleRefOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModuleRefOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LLVMJNI.delete_ModuleRefOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModuleRef getValue() {
    long cPtr = LLVMJNI.ModuleRefOut_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ModuleRef(cPtr, false);
  }

  public ModuleRefOut() {
    this(LLVMJNI.new_ModuleRefOut(), true);
  }

}
