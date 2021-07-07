package com.southwind.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author admin
 * @since 2021-07-03
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class UmUser implements Serializable {

    private static final long serialVersionUID=1L;

      private String id;

    private String name;

    private String password;

    private String telNumber;

    private String email;

    @Override
  public String toString(){
      return id+name+password+telNumber+email;
    }
}
