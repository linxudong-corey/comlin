package cn.com.yg.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 工程启动Vo
 *
 * @author ZHUANGLIBO1
 * @date 2019/11/19
 * @since 1.0
 */
public class ProjectStartVo {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 业务类型
     */
    private String businessType;
    /**
     * 业务单位
     */
    private String businessUnit;
    /**
     * 业主名称
     */
    private String ownerName;
    /**
     * 经营立项申请日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date approvalApplyDate;
    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 承接方式
     */
    private String undertakeMode;
    /**
     * 业务来源
     */
    private String businessSource;
    /**
     * 所属大区
     */
    private String largeArea;
    /**
     * 项目地点
     */
    private String projectPlace;
    /**
     * 计价原则
     */
    private String valuationMethod;
    /**
     * 建筑、施工面积
     */
    private BigDecimal projectBuildArea;
    /**
     * 预计开工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectStartDate;
    /**
     * 预计竣工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectCompletedDate;
    /**
     * 合同工期
     */
    private Integer contractPeriod;
    /**
     * 合同签订单位
     */
    private String contractSignUnit;
    /**
     * 合同金额
     */
    private BigDecimal contractAmount;
    /**
     * 项目业态
     */
    private String projectFormat;
    /**
     * 其他项目业态
     */
    private String otherProjectFormat;
    /**
     * 承包模式
     */
    private String contractMode;
    /**
     * 其他承包模式
     */
    private String otherContractMode;
    /**
     * 预计利润率
     */
    private BigDecimal expectProfitMargin;
    /**
     * 预计总收入
     */
    private BigDecimal expectTotalAmount;
    /**
     * 预计总成本
     */
    private BigDecimal expectTotalCost;
    /**
     * 开办费
     */
    private BigDecimal openCost;
    /**
     * 预计招标日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectTenderDate;
    /**
     * 开办费占比
     */
    private BigDecimal openCostMargin;
    /**
     * 地盘费
     */
    private BigDecimal territoryCost;
    /**
     * 地盘费占比
     */
    private BigDecimal territoryCostMargin;
    /**
     * 目标利润率
     */
    private BigDecimal targetProfitMargin;
    /**
     * 目标利润
     */
    private BigDecimal targetProfit;
    /**
     * 项目人月数
     */
    private BigDecimal teamAverageNumber;
    /**
     * 预计人均年产值
     */
    private BigDecimal expectAverageValue;
    /**
     * 总承包单位类型
     */
    private String contractUnitType;
    /**
     * 危大工程
     */
    private String dangerBigProject;
    /**
     * 工程情况描述
     */
    private String projectDescription;
    /**
     * 工程风险分析
     */
    private String projectRisk;
    /**
     * 备注
     */
    private String modifyDescription;
    /**
     * 是否删除
     */
    private Integer deleted;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 创建人
     */
    private String createUserId;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**
     * 更新人
     */
    private String updateUserId;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 经营立项ID
     */
    private String approveManageId;

    /**
     * 是否新业主
     */
    private String isNewOwner;

    /**
     * 是否新区域
     */
    private String isNewArea;

    /**
     * 是否聚焦
     */
    private String isFocus;

    /**
     * 中标/承接日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date winBidDate;

    /**
     * 审批状态（工程启动）
     */
    private String approveState;

    /**
     * 审批结束日期（工程启动）
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date approveEndDate;
    /**
     * 业务单位
     */
    private List<String> businessUnits;

    /**
     * 合约负责人
     */
    private String contractLeader;

    /**
     * 技术负责人
     */
    private String technicalLeader;

    /**
     * 项目负责人
     */
    private String projectLeader;

    /**
     * 项目群
     */
    private String projectGroup;
    /**
     * oa流程ID
     */
    private String oaFlowId;

    /**
     * 对应OA审批单据URL
     */
    private String oaFlowUrl;

    /**
     * 维度编码
     */
    private String dimensionCode;
    /**
     * 产品段
     */
    private String productSegment;
    /**
     * 财务项目编码
     */
    private String financialItemCode;
    /**
     * 是否老数据 1是 0否
     */
    private String isOldData;
    /**
     * 项目名称可编辑部分
     */
    private String projectNameEditable;
    /**
     * 风险抵押金缴纳金额
     */
    private BigDecimal riskMortgageAmount;
    /**
     * 是否已存在项目编码
     */
    private String isExistCode;
    /**
     * 直委项目性质
     */
    private String directProjectNature;
    /**
     * 初始合同金额
     */
    private BigDecimal initialContractAmount;
    /**
     * 合同金额是否有调整
     */
    private String isAmountAdjust;
    /**
     * 差异金额
     */
    private BigDecimal differentAmount;
    /**
     * 是否纳入报表统计
     */
    private String isFitReport;

    /**
     * 项目类型
     */
    private String projectType;

    /**
     * 总承包项目id
     */
    private String mainContractId;

    /**
     * 总承包项目名称
     */
    private String mainContractName;
    /**
     * 机构编码集合
     */
    private List<String> companyCodes;
    /**
     * 总承包项目编码
     */
    private String totalContractbProjectCode;

    public List<String> getCompanyCodes() {
        return companyCodes;
    }

    public void setCompanyCodes(List<String> companyCodes) {
        this.companyCodes = companyCodes;
    }

    public String getIsFitReport() {
        return isFitReport;
    }

    public void setIsFitReport(String isFitReport) {
        this.isFitReport = isFitReport;
    }

    public BigDecimal getDifferentAmount() {
        return differentAmount;
    }

    public void setDifferentAmount(BigDecimal differentAmount) {
        this.differentAmount = differentAmount;
    }

    public String getIsExistCode() {
        return isExistCode;
    }

    public void setIsExistCode(String isExistCode) {
        this.isExistCode = isExistCode;
    }

    public String getProjectNameEditable() {
        return projectNameEditable;
    }

    public void setProjectNameEditable(String projectNameEditable) {
        this.projectNameEditable = projectNameEditable;
    }

    public String getFinancialItemCode() {
        return financialItemCode;
    }

    public void setFinancialItemCode(String financialItemCode) {
        this.financialItemCode = financialItemCode;
    }

    public String getProductSegment() {
        return productSegment;
    }

    public void setProductSegment(String productSegment) {
        this.productSegment = productSegment;
    }

    public String getOaFlowId() {
        return oaFlowId;
    }

    public void setOaFlowId(String oaFlowId) {
        this.oaFlowId = oaFlowId;
    }

    public String getOaFlowUrl() {
        return oaFlowUrl;
    }

    public void setOaFlowUrl(String oaFlowUrl) {
        this.oaFlowUrl = oaFlowUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getApprovalApplyDate() {
        return approvalApplyDate;
    }

    public void setApprovalApplyDate(Date approvalApplyDate) {
        this.approvalApplyDate = approvalApplyDate;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUndertakeMode() {
        return undertakeMode;
    }

    public void setUndertakeMode(String undertakeMode) {
        this.undertakeMode = undertakeMode;
    }

    public String getBusinessSource() {
        return businessSource;
    }

    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource;
    }

    public String getLargeArea() {
        return largeArea;
    }

    public void setLargeArea(String largeArea) {
        this.largeArea = largeArea;
    }

    public String getProjectPlace() {
        return projectPlace;
    }

    public void setProjectPlace(String projectPlace) {
        this.projectPlace = projectPlace;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod;
    }

    public BigDecimal getProjectBuildArea() {
        return projectBuildArea;
    }

    public void setProjectBuildArea(BigDecimal projectBuildArea) {
        this.projectBuildArea = projectBuildArea;
    }

    public Date getExpectStartDate() {
        return expectStartDate;
    }

    public void setExpectStartDate(Date expectStartDate) {
        this.expectStartDate = expectStartDate;
    }

    public Date getExpectCompletedDate() {
        return expectCompletedDate;
    }

    public void setExpectCompletedDate(Date expectCompletedDate) {
        this.expectCompletedDate = expectCompletedDate;
    }

    public Integer getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(Integer contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public String getContractSignUnit() {
        return contractSignUnit;
    }

    public void setContractSignUnit(String contractSignUnit) {
        this.contractSignUnit = contractSignUnit;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getProjectFormat() {
        return projectFormat;
    }

    public void setProjectFormat(String projectFormat) {
        this.projectFormat = projectFormat;
    }

    public String getOtherProjectFormat() {
        return otherProjectFormat;
    }

    public void setOtherProjectFormat(String otherProjectFormat) {
        this.otherProjectFormat = otherProjectFormat;
    }

    public String getContractMode() {
        return contractMode;
    }

    public void setContractMode(String contractMode) {
        this.contractMode = contractMode;
    }

    public String getOtherContractMode() {
        return otherContractMode;
    }

    public void setOtherContractMode(String otherContractMode) {
        this.otherContractMode = otherContractMode;
    }

    public BigDecimal getExpectProfitMargin() {
        return expectProfitMargin;
    }

    public void setExpectProfitMargin(BigDecimal expectProfitMargin) {
        this.expectProfitMargin = expectProfitMargin;
    }

    public BigDecimal getExpectTotalAmount() {
        return expectTotalAmount;
    }

    public void setExpectTotalAmount(BigDecimal expectTotalAmount) {
        this.expectTotalAmount = expectTotalAmount;
    }

    public BigDecimal getExpectTotalCost() {
        return expectTotalCost;
    }

    public void setExpectTotalCost(BigDecimal expectTotalCost) {
        this.expectTotalCost = expectTotalCost;
    }

    public BigDecimal getOpenCost() {
        return openCost;
    }

    public void setOpenCost(BigDecimal openCost) {
        this.openCost = openCost;
    }

    public Date getExpectTenderDate() {
        return expectTenderDate;
    }

    public void setExpectTenderDate(Date expectTenderDate) {
        this.expectTenderDate = expectTenderDate;
    }

    public BigDecimal getOpenCostMargin() {
        return openCostMargin;
    }

    public void setOpenCostMargin(BigDecimal openCostMargin) {
        this.openCostMargin = openCostMargin;
    }

    public BigDecimal getTerritoryCost() {
        return territoryCost;
    }

    public void setTerritoryCost(BigDecimal territoryCost) {
        this.territoryCost = territoryCost;
    }

    public BigDecimal getTerritoryCostMargin() {
        return territoryCostMargin;
    }

    public void setTerritoryCostMargin(BigDecimal territoryCostMargin) {
        this.territoryCostMargin = territoryCostMargin;
    }

    public BigDecimal getTargetProfitMargin() {
        return targetProfitMargin;
    }

    public void setTargetProfitMargin(BigDecimal targetProfitMargin) {
        this.targetProfitMargin = targetProfitMargin;
    }

    public BigDecimal getTargetProfit() {
        return targetProfit;
    }

    public void setTargetProfit(BigDecimal targetProfit) {
        this.targetProfit = targetProfit;
    }

    public BigDecimal getTeamAverageNumber() {
        return teamAverageNumber;
    }

    public void setTeamAverageNumber(BigDecimal teamAverageNumber) {
        this.teamAverageNumber = teamAverageNumber;
    }

    public BigDecimal getExpectAverageValue() {
        return expectAverageValue;
    }

    public void setExpectAverageValue(BigDecimal expectAverageValue) {
        this.expectAverageValue = expectAverageValue;
    }

    public String getContractUnitType() {
        return contractUnitType;
    }

    public void setContractUnitType(String contractUnitType) {
        this.contractUnitType = contractUnitType;
    }

    public String getDangerBigProject() {
        return dangerBigProject;
    }

    public void setDangerBigProject(String dangerBigProject) {
        this.dangerBigProject = dangerBigProject;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectRisk() {
        return projectRisk;
    }

    public void setProjectRisk(String projectRisk) {
        this.projectRisk = projectRisk;
    }

    public String getModifyDescription() {
        return modifyDescription;
    }

    public void setModifyDescription(String modifyDescription) {
        this.modifyDescription = modifyDescription;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getApproveManageId() {
        return approveManageId;
    }

    public void setApproveManageId(String approveManageId) {
        this.approveManageId = approveManageId;
    }

    public String getIsNewOwner() {
        return isNewOwner;
    }

    public void setIsNewOwner(String isNewOwner) {
        this.isNewOwner = isNewOwner;
    }

    public String getIsNewArea() {
        return isNewArea;
    }

    public void setIsNewArea(String isNewArea) {
        this.isNewArea = isNewArea;
    }

    public String getIsFocus() {
        return isFocus;
    }

    public void setIsFocus(String isFocus) {
        this.isFocus = isFocus;
    }

    public Date getWinBidDate() {
        return winBidDate;
    }

    public void setWinBidDate(Date winBidDate) {
        this.winBidDate = winBidDate;
    }

    public String getApproveState() {
        return approveState;
    }

    public void setApproveState(String approveState) {
        this.approveState = approveState;
    }

    public Date getApproveEndDate() {
        return approveEndDate;
    }

    public void setApproveEndDate(Date approveEndDate) {
        this.approveEndDate = approveEndDate;
    }

    public void setBusinessUnits(List<String> businessUnits) {
        this.businessUnits = businessUnits;
    }

    public List<String> getBusinessUnits() {
        return businessUnits;
    }

    public String getContractLeader() {
        return contractLeader;
    }

    public void setContractLeader(String contractLeader) {
        this.contractLeader = contractLeader;
    }

    public String getTechnicalLeader() {
        return technicalLeader;
    }

    public void setTechnicalLeader(String technicalLeader) {
        this.technicalLeader = technicalLeader;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getDimensionCode() {
        return dimensionCode;
    }

    public void setDimensionCode(String dimensionCode) {
        this.dimensionCode = dimensionCode;
    }

    public String getIsOldData() {
        return isOldData;
    }

    public void setIsOldData(String isOldData) {
        this.isOldData = isOldData;
    }

    public BigDecimal getRiskMortgageAmount() {
        return riskMortgageAmount;
    }

    public void setRiskMortgageAmount(BigDecimal riskMortgageAmount) {
        this.riskMortgageAmount = riskMortgageAmount;
    }

    public String getDirectProjectNature() {
        return directProjectNature;
    }

    public void setDirectProjectNature(String directProjectNature) {
        this.directProjectNature = directProjectNature;
    }

    public BigDecimal getInitialContractAmount() {
        return initialContractAmount;
    }

    public void setInitialContractAmount(BigDecimal initialContractAmount) {
        this.initialContractAmount = initialContractAmount;
    }

    public String getIsAmountAdjust() {
        return isAmountAdjust;
    }

    public void setIsAmountAdjust(String isAmountAdjust) {
        this.isAmountAdjust = isAmountAdjust;
    }

    public String getMainContractId() {
        return mainContractId;
    }

    public void setMainContractId(String mainContractId) {
        this.mainContractId = mainContractId;
    }

    public String getMainContractName() {
        return mainContractName;
    }

    public void setMainContractName(String mainContractName) {
        this.mainContractName = mainContractName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getTotalContractbProjectCode() {
        return totalContractbProjectCode;
    }

    public void setTotalContractbProjectCode(String totalContractbProjectCode) {
        this.totalContractbProjectCode = totalContractbProjectCode;
    }
}