package net.z;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.z.f;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tu;

public class wz extends tu {
   protected f a;
   protected String n;
   private final String B;
   private final List Z = Lists.newArrayList();
   protected String r;
   protected String J;
   protected int f;
   private int D;

   public wz(f var1, String var2, String var3, int var4) {
      this.a = var1;
      this.n = var2;
      this.B = var3;
      this.f = var4;
      this.r = net.c9.b.x("gui.yes", new Object[0]);
      this.J = net.c9.b.x("gui.no", new Object[0]);
   }

   public wz(f var1, String var2, String var3, String var4, String var5, int var6) {
      this.a = var1;
      this.n = var2;
      this.B = var3;
      this.r = var4;
      this.J = var5;
      this.f = var6;
   }

   public void L() {
      this.m.add(new th(0, q / 2 - 155, V / 6 + 96, this.r));
      this.m.add(new th(1, q / 2 - 155 + 160, V / 6 + 96, this.J));
      this.Z.clear();
      this.Z.addAll(this.O.m(this.B, q - 50));
   }

   protected void t(m var1) throws IOException {
      this.a.y(var1.g == 0, this.f);
   }

   public void v(int var1, int var2, float var3) {
      g.C();
      this.C();
      this.d(this.O, this.n, q / 2, 70, 16777215);
      byte var5 = 90;
      Iterator var6 = this.Z.iterator();
      if(var6.hasNext()) {
         String var7 = (String)var6.next();
         this.d(this.O, var7, q / 2, var5, 16777215);
         int var10000 = var5 + this.O.R;
      }

      super.v(var1, var2, var3);
   }

   public void B(int var1) {
      this.D = var1;

      for(m var3 : this.m) {
         var3.O = false;
      }

   }

   public void K() {
      g.B();
      super.K();
      if(--this.D == 0) {
         Iterator var2 = this.m.iterator();
         if(var2.hasNext()) {
            m var3 = (m)var2.next();
            var3.O = true;
         }
      }

   }

   private static Exception b(Exception var0) {
      return var0;
   }
}
