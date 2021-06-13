package net.nj;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Optional;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.nj.f;
import net.nj.h;
import net.nj.q;
import net.yz.a7;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class e {
   private static final Logger x = LogManager.getLogger();

   @Nullable
   public static GameProfile g(f var0) {
      String var2 = null;
      q.H();
      String var3 = null;
      if(var0.K("Name", 8)) {
         var2 = var0.J("Name");
      }

      if(var0.K("Id", 8)) {
         var3 = var0.J("Id");
      }

      UUID var4 = UUID.fromString(var3);
      GameProfile var5 = new GameProfile(var4, var2);
      if(var0.K("Properties", 10)) {
         f var6 = var0.o("Properties");
         Iterator var7 = var6.b().iterator();
         if(var7.hasNext()) {
            String var8 = (String)var7.next();
            h var9 = var6.A(var8, 10);
            int var10 = 0;
            if(var10 < var9.z()) {
               f var11 = var9.i(var10);
               String var12 = var11.J("Value");
               if(var11.K("Signature", 8)) {
                  var5.getProperties().put(var8, new Property(var8, var12, var11.J("Signature")));
               }

               var5.getProperties().put(var8, new Property(var8, var12));
               ++var10;
            }
         }
      }

      return var5;
   }

   public static f u(f var0, GameProfile var1) {
      if(!a7.Y(var1.getName())) {
         var0.b("Name", var1.getName());
      }

      if(var1.getId() != null) {
         var0.b("Id", var1.getId().toString());
      }

      if(!var1.getProperties().isEmpty()) {
         f var2 = new f();

         for(String var4 : var1.getProperties().keySet()) {
            h var5 = new h();

            for(Property var7 : var1.getProperties().get(var4)) {
               f var8 = new f();
               var8.b("Value", var7.getValue());
               if(var7.hasSignature()) {
                  var8.b("Signature", var7.getSignature());
               }

               var5.m(var8);
            }

            var2.K(var4, var5);
         }

         var0.K("Properties", var2);
      }

      return var0;
   }

   @VisibleForTesting
   public static boolean v(q var0, q var1, boolean var2) {
      return var0 == var1?true:true;
   }

   public static f E(UUID var0) {
      f var1 = new f();
      var1.V("M", var0.getMostSignificantBits());
      var1.V("L", var0.getLeastSignificantBits());
      return var1;
   }

   public static UUID O(f var0) {
      return new UUID(var0.P("M"), var0.P("L"));
   }

   public static net.u.j L(f var0) {
      return new net.u.j(var0.P("X"), var0.P("Y"), var0.P("Z"));
   }

   public static f b(net.u.j var0) {
      f var1 = new f();
      var1.r("X", var0.t());
      var1.r("Y", var0.h());
      var1.r("Z", var0.y());
      return var1;
   }

   public static net.yw.n r(f var0) {
      if(!var0.K("Name", 8)) {
         return net.nb.f.ou.p();
      } else {
         net.y9.l var1 = (net.y9.l)net.y9.l.m.B(new m_(var0.J("Name")));
         net.yw.n var2 = var1.p();
         if(var0.K("Properties", 10)) {
            f var3 = var0.o("Properties");
            net.yw.q var4 = var1.j();

            for(String var6 : var3.b()) {
               net.yr.h var7 = var4.D(var6);
               var2 = N(var2, var7, var6, var3, var0);
            }
         }

         return var2;
      }
   }

   private static net.yw.n N(net.yw.n var0, net.yr.h var1, String var2, f var3, f var4) {
      Optional var5 = var1.y(var3.J(var2));
      if(var5.isPresent()) {
         return var0.s(var1, (Comparable)var5.get());
      } else {
         x.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.J(var2), var4.toString());
         return var0;
      }
   }

   public static f K(f var0, net.yw.n var1) {
      var0.b("Name", ((m_)net.y9.l.m.t(var1.Q())).toString());
      if(!var1.A().isEmpty()) {
         f var2 = new f();
         UnmodifiableIterator var3 = var1.A().entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            net.yr.h var5 = (net.yr.h)var4.getKey();
            var2.b(var5.l(), F(var5, (Comparable)var4.getValue()));
         }

         var0.K("Properties", var2);
      }

      return var0;
   }

   private static String F(net.yr.h var0, Comparable var1) {
      return var0.p(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
