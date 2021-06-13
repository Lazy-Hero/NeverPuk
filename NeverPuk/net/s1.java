package net;

import net.gn;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zm;
import net.m.p;
import net.ne.j;

public class s1 extends mk {
   public s1() {
      super("NoDamageTeam", or.Combat);
   }

   @mr
   public void z(zm var1) {
      String var2 = j.D();
      if(var1.r() instanceof p) {
         p var3 = (p)var1.r();
         if(var3.L() == p.f.ATTACK && gn.Q.z.o(p.H.e.Q())) {
            var1.H(true);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
