package net.z;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.z.g;
import net.z.l;
import net.z.m;
import net.z.tt;
import net.z.tu;
import net.z.wz;

public class tr extends tu {
   private int a;
   private final net.cb.t s;

   public tr(@Nullable net.cb.t var1) {
      this.s = var1;
   }

   public void L() {
      g.B();
      this.m.clear();
      this.a = 0;
      if(this.A.s8.B().b()) {
         this.m.add(new m(0, q / 2 - 100, V / 4 + 72, net.c9.b.x("deathScreen.spectate", new Object[0])));
         this.m.add(new m(1, q / 2 - 100, V / 4 + 96, net.c9.b.x("deathScreen." + (this.A.w()?"deleteWorld":"leaveServer"), new Object[0])));
      }

      this.m.add(new m(0, q / 2 - 100, V / 4 + 72, net.c9.b.x("deathScreen.respawn", new Object[0])));
      this.m.add(new m(1, q / 2 - 100, V / 4 + 96, net.c9.b.x("deathScreen.titleScreen", new Object[0])));
      if(this.A.L() == null) {
         ((m)this.m.get(1)).O = false;
      }

      Iterator var2 = this.m.iterator();
      if(var2.hasNext()) {
         m var3 = (m)var2.next();
         var3.O = false;
      }

   }

   protected void Q(char var1, int var2) throws IOException {
   }

   protected void t(m var1) throws IOException {
      switch(var1.g) {
      case 0:
         this.A.sf.D();
         this.A.s((tu)null);
         break;
      case 1:
         if(this.A.s8.B().b()) {
            this.A.s(new tt());
         } else {
            wz var2 = new wz(this, net.c9.b.x("deathScreen.quit.confirm", new Object[0]), "", net.c9.b.x("deathScreen.titleScreen", new Object[0]), net.c9.b.x("deathScreen.respawn", new Object[0]), 0);
            this.A.s(var2);
            var2.B(20);
         }
      }

   }

   public void y(boolean var1, int var2) {
      if(this.A.s8 != null) {
         this.A.s8.Z();
      }

      this.A.J((net.cp.v)null);
      this.A.s(new tt());
   }

   public void v(int var1, int var2, float var3) {
      boolean var4 = this.A.s8.B().b();
      this.T(0, 0, (double)q, (double)V, 1615855616, -1602211792);
      net.y.d.c();
      net.y.d.W(2.0F, 2.0F, 2.0F);
      this.d(this.O, net.c9.b.x("deathScreen.title.hardcore", new Object[0]), q / 2 / 2, 30, 16777215);
      net.y.d.Y();
      if(this.s != null) {
         this.d(this.O, this.s.c(), q / 2, 85, 16777215);
      }

      this.d(this.O, net.c9.b.x("deathScreen.score", new Object[0]) + ": " + net.cb.z.YELLOW + this.A.sf.N(), q / 2, 100, 16777215);
      if(this.s != null && var2 > 85 && var2 < 85 + this.O.R) {
         net.cb.t var5 = this.r(var1);
         if(var5.E().W() != null) {
            this.Z(var5, var1, var2);
         }
      }

      super.v(var1, var2, var3);
   }

   @Nullable
   public net.cb.t r(int var1) {
      if(this.s == null) {
         return null;
      } else {
         int var2 = this.A.sO.r(this.s.c());
         int var3 = q / 2 - var2 / 2;
         int var4 = q / 2 + var2 / 2;
         int var5 = var3;
         if(var1 >= var3 && var1 <= var4) {
            for(net.cb.t var7 : this.s) {
               var5 += this.A.sO.r(l.j(var7.Y(), false));
               if(var5 > var1) {
                  return var7;
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   public boolean b() {
      return false;
   }

   public void K() {
      super.K();
      ++this.a;
      if(this.a == 20) {
         for(m var2 : this.m) {
            var2.O = true;
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
