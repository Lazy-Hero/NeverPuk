package net.yk;

import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.Map.Entry;
import net.xn;
import net.nx.f;
import net.u.d;
import net.yk.m;
import net.yk.t;
import net.yz.at;

public class e {
   private final Map M = Maps.newHashMap();
   private final Map w = Maps.newHashMap();
   private final String l = UUID.randomUUID().toString();
   private final URL R;
   private final m x;
   private final Timer E = new Timer("Snooper Timer", true);
   private final Object G = new Object();
   private final long h;
   private boolean e;
   private int a;

   public e(String var1, m var2, long var3) {
      this.R = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 2);
      this.x = var2;
      this.h = var3;
   }

   public void n() {
      if(!this.e) {
         this.e = true;
         this.v();
         this.E.schedule(new TimerTask() {
            public void run() {
               String[] var1 = t.h();
               if(e.this.x.V()) {
                  f var3 = (f)e.this.G;
                  HashMap var2 = Maps.newHashMap(e.this.w);
                  if(e.this.a == 0) {
                     var2.putAll(e.this.M);
                  }

                  var2.put("snooper_count", Integer.valueOf(e.this.a++));
                  var2.put("snooper_token", e.this.l);
                  var3 = e.this.x instanceof f?(f)e.this.x:null;
                  at.l(e.this.R, var2, true, var3 == null?null:var3.c());
               }

            }

            private static xn a(xn var0) {
               return var0;
            }
         }, 0L, 900000L);
      }

   }

   private void v() {
      this.d();
      this.H("snooper_token", this.l);
      this.d("snooper_token", this.l);
      this.d("os_name", System.getProperty("os.name"));
      this.d("os_version", System.getProperty("os.version"));
      this.d("os_architecture", System.getProperty("os.arch"));
      this.d("java_version", System.getProperty("java.version"));
      this.H("version", "1.12.2");
      this.x.r(this);
   }

   private void d() {
      RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
      List var2 = var1.getInputArguments();
      int var3 = 0;

      for(String var5 : var2) {
         if(var5.startsWith("-X")) {
            this.H("jvm_arg[" + var3++ + "]", var5);
         }
      }

      this.H("jvm_args", Integer.valueOf(var3));
   }

   public void t() {
      this.d("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
      this.d("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
      this.d("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
      this.d("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
      this.x.f(this);
   }

   public void H(String var1, Object var2) {
      Object var3 = this.G;
      this.w.put(var1, var2);
   }

   public void d(String var1, Object var2) {
      Object var3 = this.G;
      this.M.put(var1, var2);
   }

   public Map P() {
      t.h();
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      Object var3 = this.G;
      this.t();
      Iterator var4 = this.M.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var2.put(var5.getKey(), var5.getValue().toString());
         d.h(new d[5]);
      }

      var4 = this.w.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var8 = (Entry)var4.next();
         var2.put(var8.getKey(), var8.getValue().toString());
      }

      return var2;
   }

   public boolean C() {
      return this.e;
   }

   public void j() {
      this.E.cancel();
   }

   public String K() {
      return this.l;
   }

   public long A() {
      return this.h;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
