package com.up.stores.entity;

import java.io.Serializable;
import java.util.Objects;

/** 省/市/区数据的实体类 */
//该类实现了 Serializable 接口，表示该对象可以被序列化和反序列化。
    //序列化和反序列化是将对象转换为字节序列（序列化）和将字节序列转换为对象（反序列化）的过程。
public class District implements Serializable {
    //id：表示区域的唯一标识符，类型为 Integer。
    //parent：表示上级区域的标识符，类型为 String。
    //code：表示区域的编码，类型为 String。
    //name：表示区域的名称，类型为 String。
    private Integer id;
    private String parent;
    private String code;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    //重写了 equals 方法，用于判断两个 District 对象是否相等。
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return Objects.equals(getId(), district.getId()) && Objects.equals(getParent(), district.getParent()) && Objects.equals(getCode(), district.getCode()) && Objects.equals(getName(), district.getName());
    }

    @Override
    //用于计算对象的哈希码。
    public int hashCode() {
        return Objects.hash(getId(), getParent(), getCode(), getName());
    }

    @Override
    //返回一个字符串表示该对象的信息
    public String toString() {
        return "District{" +
                "id=" + id +
                ", parent='" + parent + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
