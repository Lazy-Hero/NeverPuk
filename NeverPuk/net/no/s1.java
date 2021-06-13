package net.no;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import net.xn;
import net.no.s8;

public class s1 implements net.n2.k {
   private double L;
   private double l;
   private double Y;
   public float k;
   public float E;
   private Set Z;
   private int n;

   public s1() {
   }

   public s1(double var1, double var3, double var5, float var7, float var8, Set var9, int var10) {
      this.L = var1;
      this.l = var3;
      this.Y = var5;
      this.k = var7;
      this.E = var8;
      this.Z = var9;
      this.n = var10;
   }

   public void E(net.n2.h var1) throws IOException {
      this.L = var1.readDouble();
      this.l = var1.readDouble();
      this.Y = var1.readDouble();
      this.k = var1.readFloat();
      this.E = var1.readFloat();
      this.Z = s1.c.A(var1.readUnsignedByte());
      this.n = var1.q();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeDouble(this.L);
      var1.writeDouble(this.l);
      var1.writeDouble(this.Y);
      var1.writeFloat(this.k);
      var1.writeFloat(this.E);
      var1.writeByte(s1.c.z(this.Z));
      var1.a(this.n);
   }

   public void v(net.x.t var1) {
      var1.p(this);
   }

   public double E() {
      return this.L;
   }

   public double i() {
      return this.l;
   }

   public double J() {
      return this.Y;
   }

   public float U() {
      return this.k;
   }

   public float D() {
      return this.E;
   }

   public int v() {
      return this.n;
   }

   public Set P() {
      return this.Z;
   }

   public static enum c {
      X(0),
      Y(1),
      Z(2),
      Y_ROT(3),
      X_ROT(4);

      private final int w;

      private c(int var3) {
         this.w = var3;
      }

      private int w() {
         return 1 << this.w;
      }

      private boolean m(int var1) {
         return (var1 & this.w()) == this.w();
      }

      public static Set A(int var0) {
         EnumSet var2 = EnumSet.noneOf(s1.c.class);
         s8.x();
         s1.c[] var3 = values();
         int var4 = var3.length;
         int var5 = 0;
         if(var5 < var4) {
            s1.c var6 = var3[var5];
            if(var6.m(var0)) {
               var2.add(var6);
            }

            ++var5;
         }

         return var2;
      }

      public static int z(Set var0) {
         int var2 = 0;
         s8.x();
         Iterator var3 = var0.iterator();
         if(var3.hasNext()) {
            s1.c var4 = (s1.c)var3.next();
            var2 |= var4.w();
         }

         return var2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
