package net.ct;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.cg.r;
import net.ct.c;
import net.ct.t;
import net.yz.ao;

public class g {
   private final net.cg.j z;

   public g(net.cg.j var1) {
      this.z = var1;
   }

   public String Z() {
      return this.z.M();
   }

   public boolean T(String var1) {
      return this.z.v(var1);
   }

   public boolean X(String var1, ao var2) {
      return this.z.C(var1, var2);
   }

   public boolean S(String var1) {
      return this.z.A(var1);
   }

   public boolean d(String var1) {
      return this.z.c(var1);
   }

   public boolean C(String var1) {
      return this.z.R(var1);
   }

   public boolean N(String var1) {
      return this.z.y(var1);
   }

   public void A(String var1, String var2) {
      this.z.d(var1, var2);
   }

   public void w() {
      this.z.h();
   }

   public List T() throws net.nn.o {
      t.j();
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = this.z.Q().iterator();
      if(var3.hasNext()) {
         r var4 = (r)var3.next();
         var2.add(new c(var4));
      }

      return var2;
   }

   private static net.nn.o a(net.nn.o var0) {
      return var0;
   }
}
