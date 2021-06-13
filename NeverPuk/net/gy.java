package net;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net._f;
import net.uv;
import net.u.j;

public class gy implements Iterator {
   private final double d;
   private final double E;
   private final int z;
   private final int g;
   private double B;
   private double l;
   private double Y;
   private double j;
   private int A;
   private double f;
   private double Q;
   private final _f S = new _f(0, 0, 0);
   private boolean Z = false;

   public gy(j var1, j var2, double var3, double var5) {
      this.d = var3;
      this.E = var5;
      this.z = var1.t();
      this.g = var2.t();
      uv.l();
      this.B = (double)var1.h();
      this.l = (double)var2.h() - 0.5D;
      this.Y = (double)var1.y();
      this.j = (double)var2.y() - 0.5D;
      this.A = this.z;
      this.f = this.B;
      this.Q = this.Y;
      this.Z = this.A < this.g && this.f < this.l && this.Q < this.j;
   }

   public boolean hasNext() {
      return this.Z;
   }

   public j C() {
      if(!this.Z) {
         throw new NoSuchElementException();
      } else {
         this.S.r((double)this.A, this.f, this.Q);
         this.A();
         this.Z = this.A < this.g && this.f < this.l && this.Q < this.j;
         return this.S;
      }
   }

   private void A() {
      ++this.Q;
      if(this.Q >= this.j) {
         this.Q = this.Y;
         ++this.f;
         if(this.f >= this.l) {
            this.f = this.B;
            this.B += this.d;
            this.l += this.d;
            this.f = this.B;
            this.Y += this.E;
            this.j += this.E;
            this.Q = this.Y;
            ++this.A;
            if(this.A >= this.g) {
               ;
            }
         }
      }

   }

   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   public static void main(String[] var0) throws Exception {
      j var1 = new j(-2, 10, 20);
      j var2 = new j(2, 12, 22);
      double var3 = -0.5D;
      double var5 = 0.5D;
      gy var7 = new gy(var1, var2, var3, var5);
      System.out.println("Start: " + var1 + ", end: " + var2 + ", yDelta: " + var3 + ", zDelta: " + var5);

      while(var7.hasNext()) {
         j var8 = var7.C();
         System.out.println("" + var8);
      }

   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}
