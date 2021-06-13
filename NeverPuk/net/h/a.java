package net.h;

import net.xn;
import net.h.d;
import net.h.l;
import net.yz.m_;
import net.yz.p;

public class a extends l {
   public a(net.yz.a var1, p var2, float var3, float var4, net.u.j var5) {
      this(var1, var2, var3, var4, (float)var5.t() + 0.5F, (float)var5.h() + 0.5F, (float)var5.y() + 0.5F);
   }

   public static a v(net.yz.a var0, float var1) {
      return a(var0, var1, 0.25F);
   }

   public static a a(net.yz.a var0, float var1, float var2) {
      return new a(var0, p.MASTER, var2, var1, false, 0, d.x.NONE, 0.0F, 0.0F, 0.0F);
   }

   public static a A(net.yz.a var0) {
      return new a(var0, p.MUSIC, 1.0F, 1.0F, false, 0, d.x.NONE, 0.0F, 0.0F, 0.0F);
   }

   public static a J(net.yz.a var0, float var1, float var2, float var3) {
      return new a(var0, p.RECORDS, 4.0F, 1.0F, false, 0, d.x.LINEAR, var1, var2, var3);
   }

   public a(net.yz.a var1, p var2, float var3, float var4, float var5, float var6, float var7) {
      this((net.yz.a)var1, var2, var3, var4, false, 0, d.x.LINEAR, var5, var6, var7);
   }

   private a(net.yz.a var1, p var2, float var3, float var4, boolean var5, int var6, d.x var7, float var8, float var9, float var10) {
      this(var1.J(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public a(m_ var1, p var2, float var3, float var4, boolean var5, int var6, d.x var7, float var8, float var9, float var10) {
      l.l();
      super(var1, var2);
      this.e = var3;
      this.J = var4;
      this.g = var8;
      this.C = var9;
      this.t = var10;
      this.B = var5;
      this.y = var6;
      this.Z = var7;
      if(net.u.d.y() == null) {
         l.I(new String[2]);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
