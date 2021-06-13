package net.n5;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import net.xn;
import net.n5.g;
import net.n5.m;
import net.y.b;

public class i implements Comparable {
   private final m g;
   private final ReentrantLock o = new ReentrantLock();
   private final List N = Lists.newArrayList();
   private final i.f E;
   private final double U;
   private b S;
   private g V;
   private i.a b = i.a.PENDING;
   private boolean h;

   public i(m var1, i.f var2, double var3) {
      this.g = var1;
      this.E = var2;
      this.U = var3;
   }

   public i.a C() {
      return this.b;
   }

   public m D() {
      return this.g;
   }

   public g X() {
      return this.V;
   }

   public void E(g var1) {
      this.V = var1;
   }

   public b m() {
      return this.S;
   }

   public void g(b var1) {
      this.S = var1;
   }

   public void a(i.a var1) {
      this.o.lock();
      this.b = var1;
      this.o.unlock();
   }

   public void v() {
      m.t();
      this.o.lock();
      if(this.E == i.f.REBUILD_CHUNK && this.b != i.a.DONE) {
         this.g.Z(false);
      }

      this.h = true;
      this.b = i.a.DONE;
      Iterator var2 = this.N.iterator();
      if(var2.hasNext()) {
         Runnable var3 = (Runnable)var2.next();
         var3.run();
      }

      this.o.unlock();
   }

   public void M(Runnable var1) {
      this.o.lock();
      this.N.add(var1);
      if(this.h) {
         var1.run();
      }

      this.o.unlock();
   }

   public ReentrantLock B() {
      return this.o;
   }

   public i.f Y() {
      return this.E;
   }

   public boolean K() {
      return this.h;
   }

   public int q(i var1) {
      return Doubles.compare(this.U, var1.U);
   }

   public double I() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum a {
      PENDING,
      COMPILING,
      UPLOADING,
      DONE;
   }

   public static enum f {
      REBUILD_CHUNK,
      RESORT_TRANSPARENCY;
   }
}
