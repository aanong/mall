package mall.goods.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName spu
 */
@TableName(value ="spu")
@Data
public class Spu implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * SPU名
     */
    private String name;

    /**
     * 简介
     */
    private String intro;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 一级分类
     */
    private Integer categoryOneId;

    /**
     * 二级分类
     */
    private Integer categoryTwoId;

    /**
     * 三级分类
     */
    private Integer categoryThreeId;

    /**
     * 图片列表
     */
    private String images;

    /**
     * 售后服务
     */
    private String afterSalesService;

    /**
     * 介绍
     */
    private String content;

    /**
     * 规格列表
     */
    private String attributeList;

    /**
     * 是否上架,0已下架，1已上架
     */
    private Integer isMarketable;

    /**
     * 是否删除,0:未删除，1：已删除
     */
    private Integer isDelete;

    /**
     * 审核状态，0：未审核，1：已审核，2：审核不通过
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Spu other = (Spu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getCategoryOneId() == null ? other.getCategoryOneId() == null : this.getCategoryOneId().equals(other.getCategoryOneId()))
            && (this.getCategoryTwoId() == null ? other.getCategoryTwoId() == null : this.getCategoryTwoId().equals(other.getCategoryTwoId()))
            && (this.getCategoryThreeId() == null ? other.getCategoryThreeId() == null : this.getCategoryThreeId().equals(other.getCategoryThreeId()))
            && (this.getImages() == null ? other.getImages() == null : this.getImages().equals(other.getImages()))
            && (this.getAfterSalesService() == null ? other.getAfterSalesService() == null : this.getAfterSalesService().equals(other.getAfterSalesService()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getAttributeList() == null ? other.getAttributeList() == null : this.getAttributeList().equals(other.getAttributeList()))
            && (this.getIsMarketable() == null ? other.getIsMarketable() == null : this.getIsMarketable().equals(other.getIsMarketable()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getCategoryOneId() == null) ? 0 : getCategoryOneId().hashCode());
        result = prime * result + ((getCategoryTwoId() == null) ? 0 : getCategoryTwoId().hashCode());
        result = prime * result + ((getCategoryThreeId() == null) ? 0 : getCategoryThreeId().hashCode());
        result = prime * result + ((getImages() == null) ? 0 : getImages().hashCode());
        result = prime * result + ((getAfterSalesService() == null) ? 0 : getAfterSalesService().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getAttributeList() == null) ? 0 : getAttributeList().hashCode());
        result = prime * result + ((getIsMarketable() == null) ? 0 : getIsMarketable().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", intro=").append(intro);
        sb.append(", brandId=").append(brandId);
        sb.append(", categoryOneId=").append(categoryOneId);
        sb.append(", categoryTwoId=").append(categoryTwoId);
        sb.append(", categoryThreeId=").append(categoryThreeId);
        sb.append(", images=").append(images);
        sb.append(", afterSalesService=").append(afterSalesService);
        sb.append(", content=").append(content);
        sb.append(", attributeList=").append(attributeList);
        sb.append(", isMarketable=").append(isMarketable);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}