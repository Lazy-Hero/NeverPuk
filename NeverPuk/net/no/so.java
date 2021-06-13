package net.no;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.no.s8;

public class so implements net.n2.k {
   public static double Q;
   public static double v;
   public static double B;
   private float l;
   private List n;
   public float e;
   public float J;
   public float d;

   public so() {
   }

   public so(double var1, double var3, double var5, float var7, List var8, net.u.r var9) {
      Q = var1;
      v = var3;
      B = var5;
      this.l = var7;
      this.n = Lists.newArrayList(var8);
      this.e = (float)var9.p;
      this.J = (float)var9.H;
      this.d = (float)var9.a;
   }

   public void E(net.n2.h var1) throws IOException {
      Q = (double)var1.readFloat();
      v = (double)var1.readFloat();
      B = (double)var1.readFloat();
      this.l = var1.readFloat();
      s8.Y();
      int var3 = var1.readInt();
      this.n = Lists.newArrayListWithCapacity(var3);
      int var4 = (int)Q;
      int var5 = (int)v;
      int var6 = (int)B;
      int var7 = 0;
      if(var7 < var3) {
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         int var10 = var1.readByte() + var6;
         this.n.add(new net.u.j(var8, var9, var10));
         ++var7;
      }

      this.e = var1.readFloat();
      this.J = var1.readFloat();
      this.d = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeFloat((float)Q);
      var1.writeFloat((float)v);
      var1.writeFloat((float)B);
      var1.writeFloat(this.l);
      var1.writeInt(this.n.size());
      s8.x();
      int var3 = (int)Q;
      int var4 = (int)v;
      int var5 = (int)B;
      Iterator var6 = this.n.iterator();
      if(var6.hasNext()) {
         net.u.j var7 = (net.u.j)var6.next();
         int var8 = var7.t() - var3;
         int var9 = var7.h() - var4;
         int var10 = var7.y() - var5;
         var1.writeByte(var8);
         var1.writeByte(var9);
         var1.writeByte(var10);
      }

      var1.writeFloat(this.e);
      var1.writeFloat(this.J);
      var1.writeFloat(this.d);
   }

   public void V(net.x.t var1) {
      var1.y(this);
   }

   public float f() {
      return this.e;
   }

   public float A() {
      return this.J;
   }

   public float v() {
      return this.d;
   }

   public double S() {
      return Q;
   }

   public double z() {
      return v;
   }

   public double Y() {
      return B;
   }

   public float R() {
      return this.l;
   }

   public List A() {
      return this.n;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
