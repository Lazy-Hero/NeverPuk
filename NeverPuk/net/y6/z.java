package net.y6;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.xn;
import net.y6.j;
import net.y6.jb;

public abstract class z {
   public float v;
   public boolean z;
   public boolean n = true;
   public List t = Lists.newArrayList();
   private final Map x = Maps.newHashMap();
   public int f = 64;
   public int C = 32;
   private static boolean j;

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
   }

   public jb r(Random var1) {
      return (jb)this.t.get(var1.nextInt(this.t.size()));
   }

   protected void w(String var1, int var2, int var3) {
      this.x.put(var1, new j(var2, var3));
   }

   public j O(String var1) {
      return (j)this.x.get(var1);
   }

   public static void b(jb var0, jb var1) {
      var1.b = var0.b;
      var1.N = var0.N;
      var1.c = var0.c;
      var1.l = var0.l;
      var1.I = var0.I;
      var1.h = var0.h;
   }

   public void q(net.y6.z var1) {
      this.v = var1.v;
      this.z = var1.z;
      this.n = var1.n;
   }

   public static void j(boolean var0) {
      j = var0;
   }

   public static boolean W() {
      return j;
   }

   public static boolean C() {
      boolean var0 = W();
      return true;
   }

   private static xn c(xn var0) {
      return var0;
   }

   static {
      if(C()) {
         j(true);
      }

   }
}
