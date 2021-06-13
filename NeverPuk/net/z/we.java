package net.z;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.y.ui;
import net.z.g;
import net.z.i;
import net.z.j;
import net.z.m;
import net.z.th;
import net.z.tu;

public class we extends tu {
   private final tu y;
   private List z;
   private List W;
   private i Y;
   private j B;
   private boolean Z;

   public we(tu var1) {
      this.y = var1;
   }

   public void L() {
      this.m.add(new th(2, q / 2 - 154, V - 48, net.c9.b.x("resourcePack.openFolder", new Object[0])));
      g.B();
      this.m.add(new th(1, q / 2 + 4, V - 48, net.c9.b.x("gui.done", new Object[0])));
      if(!this.Z) {
         this.z = Lists.newArrayList();
         this.W = Lists.newArrayList();
         net.c9.c var2 = this.A.g();
         var2.b();
         ArrayList var3 = Lists.newArrayList(var2.b());
         var3.removeAll(var2.q());
         Iterator var4 = var3.iterator();
         if(var4.hasNext()) {
            net.c9.c var5 = (net.c9.c)var4.next();
            this.z.add(new net.c9.j(this, var5));
         }

         net.c9.c var7 = var2.C();
         this.W.add(new net.c9.w(this, var2.M()));
         Iterator var8 = Lists.reverse(var2.q()).iterator();
         if(var8.hasNext()) {
            net.c9.c var6 = (net.c9.c)var8.next();
            this.W.add(new net.c9.j(this, var6));
         }

         this.W.add(new net.c9.e(this));
      }

      this.Y = new i(this.A, 200, V, this.z);
      this.Y.j(q / 2 - 4 - 200);
      this.Y.A(7, 8);
      this.B = new j(this.A, 200, V, this.W);
      this.B.j(q / 2 + 4);
      this.B.A(7, 8);
   }

   public void m() throws IOException {
      super.m();
      this.B.q();
      this.Y.q();
   }

   public boolean M(net.c9.u var1) {
      return this.W.contains(var1);
   }

   public List g(net.c9.u var1) {
      return this.M(var1)?this.W:this.z;
   }

   public List z() {
      return this.z;
   }

   public List C() {
      return this.W;
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 2) {
            File var2 = this.A.g().h();
            ui.z(var2);
         } else if(var1.g == 1) {
            if(this.Z) {
               ArrayList var5 = Lists.newArrayList();

               for(net.c9.u var4 : this.W) {
                  if(var4 instanceof net.c9.j) {
                     var5.add(((net.c9.j)var4).d());
                  }
               }

               Collections.reverse(var5);
               this.A.g().x(var5);
               this.A.T.f.clear();
               this.A.T.wc.clear();

               for(net.c9.c var7 : var5) {
                  this.A.T.f.add(var7.V());
                  if(var7.F() != 3) {
                     this.A.T.wc.add(var7.V());
                  }
               }

               this.A.T.m();
               this.A.R();
            }

            this.A.s(this.y);
         }
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.Y.x(var1, var2, var3);
      this.B.x(var1, var2, var3);
   }

   protected void E(int var1, int var2, int var3) {
      super.E(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.F(0);
      this.Y.Z(var1, var2, var3);
      this.B.Z(var1, var2, var3);
      this.d(this.O, net.c9.b.x("resourcePack.title", new Object[0]), q / 2, 16, 16777215);
      this.d(this.O, net.c9.b.x("resourcePack.folderInfo", new Object[0]), q / 2 - 77, V - 26, 8421504);
      super.v(var1, var2, var3);
   }

   public void y() {
      this.Z = true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
