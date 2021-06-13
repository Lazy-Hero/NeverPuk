package com.sun.jna;

import com.sun.jna.c;
import com.sun.jna.f;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

public class ce {
   ReferenceQueue g = new ReferenceQueue();
   IdentityHashMap K = new IdentityHashMap();

   public synchronized void c(Object var1, f var2) {
      this.N();
      WeakReference var3 = new WeakReference(var1, this.g);
      this.K.put(var3, var2);
   }

   public synchronized void N() {
      c.F();
      Reference var2 = this.g.poll();
      this.K.remove(var2);
      var2 = this.g.poll();
   }
}
