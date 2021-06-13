package com.sun.jna;

import com.sun.jna.ca;
import com.sun.jna.co;
import com.sun.jna.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface cm extends y {
   Map g = Collections.unmodifiableMap(new HashMap() {
      private static final long serialVersionUID = 1L;

      {
         this.put("type-mapper", ca.K);
         this.put("function-mapper", co.J);
      }
   });
   Map A = Collections.unmodifiableMap(new HashMap() {
      private static final long serialVersionUID = 1L;

      {
         this.put("type-mapper", ca.P);
         this.put("function-mapper", co.a);
      }
   });
   Map z = g;

   static default {
      Boolean.getBoolean("w32.ascii");
   }
}
