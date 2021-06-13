package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Iterator;
import net._v;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.o5;
import net.or;
import net.xn;
import net.zf;
import net.zn;
import net.ne.j;
import net.no.y;
import net.r.r;

public class mo extends mk {
   public static ArrayList K = new ArrayList();
   private boolean f;

   public mo() {
      super("AntiBot", or.Combat);
      ArrayList var1 = new ArrayList();
      var1.add("Matrix");
      var1.add("Need Hit");
      gn.Q.J.d(new mc("AntiBot Mode", this, "Matrix", var1));
   }

   @mr
   public void P(zn var1) {
      String var2 = gn.Q.J.S("AntiBot Mode").M();
      this.t(var2);
   }

   @mr
   public void q(o5 var1) {
      if(this.v()) {
         String var2 = gn.Q.J.S("AntiBot Mode").M();
         if(var2.equalsIgnoreCase("Need Hit")) {
            r var3 = (r)p.H.e;
            String var4 = var3.Q();
            if(gn.Q.z.G().contains(var3.Q())) {
               return;
            }

            if(K.contains(var3)) {
               _v.A(ChatFormatting.RED + var4 + ChatFormatting.WHITE + " Already in AntiBot-List!");
            } else {
               _v.A(ChatFormatting.RED + var4 + ChatFormatting.WHITE + " Was added in AntiBot-List!");
            }
         }
      }

   }

   @mr
   public void p(zf var1) {
      j.D();
      String var3 = gn.Q.J.S("AntiBot Mode").M();
      if(var3.equalsIgnoreCase("Matrix")) {
         if(var1.w() instanceof y) {
            this.f = false;
         }

         net.no.s3 var4 = (net.no.s3)var1.w();
         if(p.sf != null && var1.w() instanceof net.no.s3 && var4.G() == net.no.s3.ADD_PLAYER) {
            String var5 = ((net.no.s3)var4.m().get(0)).o().getName();
            if(!this.f) {
               this.f = var5.equals(p.sf.Q());
            }

            if(!p.sf.VX() && !p.sf.a6.P) {
               Iterator var6 = ((net.no.s3)var1.w()).m().iterator();
               if(var6.hasNext()) {
                  net.no.s3 var7 = (net.no.s3)var6.next();
                  if(!var7.n().equals("NOT_SET") && var7.Y() != 0) {
                     var1.H(true);
                  }
               }
            }
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
