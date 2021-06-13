package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.IOException;
import java.util.function.Predicate;
import net._v;
import net.ds;
import net.gn;
import net.mk;
import net.mr;
import net.o9;
import net.or;
import net.pi;
import net.z7;
import net.z_;
import net.r.r;
import net.z.m;

public class v_ extends mk {
   public v_() {
      super("MCF", or.Player);
   }

   @mr
   public void r(z7 var1) {
      int[] var2 = m.a();
      if(var1.R == 2 && p.B instanceof r) {
         if(gn.Q.z.G().stream().anyMatch((var0) -> {
            return var0.M().equals(p.B.Q());
         })) {
            gn.Q.z.G().remove(gn.Q.z.N(p.B.Q()));
            _v.A(ChatFormatting.RED + "Removed " + ChatFormatting.RESET + "\'" + p.B.Q() + "\' as Friend!");
            pi.d("MCF", "Removed \'" + p.B.Q() + "\' as Friend!", 4, z_.INFO);
         }

         gn.Q.z.d(new o9(p.B.Q()));
         _v.A(ChatFormatting.GREEN + "Added " + ChatFormatting.RESET + p.B.Q() + " as Friend!");
         pi.d("MCF", "Added " + p.B.Q() + " as Friend!", 4, z_.SUCCESS);
      }

      gn.Y().q(ds.class).Q();
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
