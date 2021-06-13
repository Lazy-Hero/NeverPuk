package net.cp;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.cp.d;
import net.cp.v;
import net.nj.x;
import net.nn.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t {
   private static final Logger N = LogManager.getLogger();
   private final j D;
   private final List u = Lists.newArrayList();

   public t(j var1) {
      this.D = var1;
      this.C();
   }

   public void C() {
      String[] var1 = v.s();
      this.u.clear();
      net.nj.f var2 = x.K(new File(this.D.sn, "servers.dat"));
      if(var2 != null) {
         net.nj.h var3 = var2.A("servers", 10);
         int var4 = 0;
         if(var4 < var3.z()) {
            this.u.add(d.t(var3.i(var4)));
            ++var4;
         }

      }
   }

   public void h() {
      String[] var1 = v.s();
      net.nj.h var2 = new net.nj.h();
      Iterator var3 = this.u.iterator();
      if(var3.hasNext()) {
         d var4 = (d)var3.next();
         var2.m(var4.S());
      }

      net.nj.f var5 = new net.nj.f();
      var5.K("servers", var2);
      x.q(var5, new File(this.D.sn, "servers.dat"));
   }

   public d V(int var1) {
      return (d)this.u.get(var1);
   }

   public void l(int var1) {
      this.u.remove(var1);
   }

   public void f(d var1) {
      this.u.add(var1);
   }

   public int u() {
      return this.u.size();
   }

   public void y(int var1, int var2) {
      d var3 = this.V(var1);
      this.u.set(var1, this.V(var2));
      this.u.set(var2, var3);
      this.h();
   }

   public void U(int var1, d var2) {
      this.u.set(var1, var2);
   }

   public static void N(d var0) {
      t var1 = new t(j.b());
      var1.C();

      for(int var2 = 0; var2 < var1.u(); ++var2) {
         d var3 = var1.V(var2);
         if(var3.U.equals(var0.U) && var3.C.equals(var0.C)) {
            var1.U(var2, var0);
            break;
         }
      }

      var1.h();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
