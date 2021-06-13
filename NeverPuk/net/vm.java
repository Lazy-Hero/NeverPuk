package net;

import java.awt.Color;
import java.util.Iterator;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.ue;
import net.xh;
import net.xn;
import net.nb.j;
import net.ni.e;
import net.ni.k;
import net.ni.n;
import net.ni.u;
import net.ni.y;

public class vm extends mk {
   public static mc i;
   public static mc Z;
   public static mc X;
   public static mc I;
   public static mc O;
   public static mc a;
   public static mc A;
   public static mc F;
   public static mc V;
   private final mc T;
   private final mc f;
   private final mc x;

   public vm() {
      super("BlockESP", or.Visuals);
      gn.Q.J.d(Z = new mc("Chest", this, true));
      gn.Q.J.d(i = new mc("EnderChest", this, false));
      gn.Q.J.d(this.x = new mc("Spawner", this, false));
      gn.Q.J.d(this.f = new mc("Shulker", this, false));
      gn.Q.J.d(this.T = new mc("Bed", this, true));
      gn.Q.J.d(I = new mc("Chest Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(O = new mc("EnderChest Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(a = new mc("Shulker Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(F = new mc("Spawner Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(A = new mc("Bed Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(V = new mc("ESP Outline", this, false));
      gn.Q.J.d(X = new mc("Client Colors", this, false));
   }

   @mr
   public void Y(ue var1) {
      int var2 = j.M();
      Color var3 = X.Q()?gn.M():new Color(I.T());
      Color var4 = X.Q()?gn.M():new Color(O.T());
      Color var5 = X.Q()?gn.M():new Color(a.T());
      Color var6 = X.Q()?gn.M():new Color(A.T());
      Color var7 = X.Q()?gn.M():new Color(F.T());
      if(p.sf != null || p.s8 != null) {
         Iterator var8 = p.s8.S.iterator();
         if(var8.hasNext()) {
            net.ni.v var9 = (net.ni.v)var8.next();
            net.u.j var10 = var9.C();
            if(var9 instanceof k && Z.Q()) {
               xh.H(var10, new Color(var3.getRGB()), 1.0D, 1.0D);
            }

            if(var9 instanceof n && i.Q()) {
               xh.H(var10, new Color(var4.getRGB()), 1.0D, 1.0D);
            }

            if(var9 instanceof y && this.T.Q()) {
               xh.H(var10, new Color(var6.getRGB()), 1.0D, 1.0D);
            }

            if(var9 instanceof e && this.f.Q()) {
               xh.H(var10, new Color(var5.getRGB()), 1.0D, 1.0D);
            }

            if(var9 instanceof u && this.x.Q()) {
               xh.H(var10, new Color(var7.getRGB()), 1.0D, 1.0D);
            }
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
