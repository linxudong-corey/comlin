package cn.com.yg.dto;

import cn.com.yg.entity.ProjectStart;

import java.math.BigDecimal;

/**
 * 工程启动DTO
 *
 * @author ZHUANGLIBO1
 * @date 2019-11-19
 * @since 1.0
 */
public class ProjectStartDTO extends ProjectStart {
    /**
     * 差异金额
     */
    private BigDecimal differentAmount;
    /**
     * 总承包项目编码
     */
    private String totalContractbProjectCode;

    public BigDecimal getDifferentAmount() {
        return differentAmount;
    }

    public void setDifferentAmount(BigDecimal differentAmount) {
        this.differentAmount = differentAmount;
    }

    public String getTotalContractbProjectCode() {
        return totalContractbProjectCode;
    }

    public void setTotalContractbProjectCode(String totalContractbProjectCode) {
        this.totalContractbProjectCode = totalContractbProjectCode;
    }
}