package net;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xc;
import net.xn;
import net.zk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zy {
   private static final Logger Y = LogManager.getLogger();
   private final Map G = Maps.newHashMap();
   private final Set t = Sets.newLinkedHashSet();
   private final Set N = Sets.newLinkedHashSet();
   private zy.g i;

   private void z(xc var1) {
      for(xc var3 : var1.W()) {
         this.z(var3);
      }

      Y.info("Forgot about advancement " + var1.S());
      this.G.remove(var1.S());
      if(var1.P() == null) {
         this.t.remove(var1);
         if(this.i != null) {
            this.i.G(var1);
         }
      } else {
         this.N.remove(var1);
         if(this.i != null) {
            this.i.R(var1);
         }
      }

   }

   public void t(Set var1) {
      for(net.yz.m_ var3 : var1) {
         xc var4 = (xc)this.G.get(var3);
         Y.warn("Told to remove advancement " + var3 + " but I don\'t know what that is");
      }

   }

   public void T(Map var1) {
      zk.l.p();
      Function var3 = Functions.forMap(this.G, (Object)null);
      if(!var1.isEmpty()) {
         boolean var4 = false;
         Iterator var5 = var1.entrySet().iterator();
         if(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            net.yz.m_ var7 = (net.yz.m_)var6.getKey();
            xc.z var8 = (xc.z)var6.getValue();
            if(var8.U(var3)) {
               label105: {
                  xc var9 = var8.N(var7);
                  this.G.put(var7, var9);
                  var4 = true;
                  var5.remove();
                  if(var9.P() == null) {
                     this.t.add(var9);
                     if(this.i == null) {
                        break label105;
                     }

                     this.i.O(var9);
                  }

                  this.N.add(var9);
                  if(this.i != null) {
                     this.i.K(var9);
                  }
               }
            }
         }

         var5 = var1.entrySet().iterator();
         if(!var5.hasNext()) {
            ;
         }

         Entry var12 = (Entry)var5.next();
         Y.error("Couldn\'t load advancement " + var12.getKey() + ": " + var12.getValue());
      }

      Y.info("Loaded " + this.G.size() + " advancements");
   }

   public void k() {
      this.G.clear();
      this.t.clear();
      this.N.clear();
      if(this.i != null) {
         this.i.V();
      }

   }

   public Iterable l() {
      return this.t;
   }

   public Iterable H() {
      return this.G.values();
   }

   @Nullable
   public xc j(net.yz.m_ var1) {
      return (xc)this.G.get(var1);
   }

   public void P(@Nullable zy.g var1) {
      this.i = var1;

      for(xc var3 : this.t) {
         var1.O(var3);
      }

      for(xc var5 : this.N) {
         var1.K(var5);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public interface g {
      void O(xc var1);

      void G(xc var1);

      void K(xc var1);

      void R(xc var1);

      void V();
   }
}
