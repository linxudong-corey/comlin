package cn.com.yg.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 工程启动
 *
 * @author ZHUANGLIBO1
 * @date 2019-11-19
 * @since 1.0
 */
@TableName("t_project_start")
@Data
public class ProjectStart {

    private static final long serialVersionUID = 1L;
    @TableId("id")
    private String id;
    @Version
    @TableField(
            fill = FieldFill.INSERT
    )
    private Integer version;
    @TableField(
            value = "deleted",
            fill = FieldFill.INSERT
    )
    @TableLogic
    private Integer deleted;
    @TableField(
            fill = FieldFill.INSERT
    )
    private Date createTime;
    @TableField(
            fill = FieldFill.INSERT
    )
    private String createUserId;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    private Date updateTime;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    private String updateUserId;

    /**
     * 业务类型
     */
    @TableField("business_type")
    private String businessType;
    /**
     * 业务单位
     */
    @TableField("business_unit")
    private String businessUnit;
    /**
     * 业主名称
     */
    @TableField("owner_name")
    private String ownerName;
    /**
     * 经营立项申请日期
     */
    @TableField("approval_apply_date")
    private Date approvalApplyDate;
    /**
     * 项目编码
     */
    @TableField("project_code")
    private String projectCode;
    /**
     * 项目名称
     */
    @TableField("project_name")
    private String projectName;
    /**
     * 项目名称可编辑部分
     */
    @TableField("project_name_editable")
    private String projectNameEditable;
    /**
     * 承接方式
     */
    @TableField("undertake_mode")
    private String undertakeMode;
    /**
     * 业务来源
     */
    @TableField("business_source")
    private String businessSource;
    /**
     * 所属大区
     */
    @TableField("large_area")
    private String largeArea;
    /**
     * 项目地点
     */
    @TableField("project_place")
    private String projectPlace;
    /**
     * 计价原则
     */
    @TableField("valuation_method")
    private String valuationMethod;
    /**
     * 建筑、施工面积
     */
    @TableField("project_build_area")
    private BigDecimal projectBuildArea;
    /**
     * 预计开工日期
     */
    @TableField("expect_start_date")
    private Date expectStartDate;
    /**
     * 预计竣工日期
     */
    @TableField("expect_completed_date")
    private Date expectCompletedDate;
    /**
     * 合同工期
     */
    @TableField("contract_period")
    private Integer contractPeriod;
    /**
     * 合同签订单位
     */
    @TableField("contract_sign_unit")
    private String contractSignUnit;
    /**
     * 合同金额
     */
    @TableField("contract_amount")
    private BigDecimal contractAmount;
    /**
     * 项目业态
     */
    @TableField("project_format")
    private String projectFormat;
    /**
     * 其他项目业态
     */
    @TableField("other_project_format")
    private String otherProjectFormat;
    /**
     * 承包模式
     */
    @TableField("contract_mode")
    private String contractMode;
    /**
     * 其他承包模式
     */
    @TableField("other_contract_mode")
    private String otherContractMode;
    /**
     * 预计利润率
     */
    @TableField("expect_profit_margin")
    private BigDecimal expectProfitMargin;
    /**
     * 预计总收入
     */
    @TableField("expect_total_amount")
    private BigDecimal expectTotalAmount;
    /**
     * 预计总成本
     */
    @TableField("expect_total_cost")
    private BigDecimal expectTotalCost;
    /**
     * 开办费
     */
    @TableField("open_cost")
    private BigDecimal openCost;
    /**
     * 预计招标日期
     */
    @TableField("expect_tender_date")
    private Date expectTenderDate;
    /**
     * 开办费占比
     */
    @TableField("open_cost_margin")
    private BigDecimal openCostMargin;
    /**
     * 地盘费
     */
    @TableField("territory_cost")
    private BigDecimal territoryCost;
    /**
     * 地盘费占比
     */
    @TableField("territory_cost_margin")
    private BigDecimal territoryCostMargin;
    /**
     * 目标利润率
     */
    @TableField("target_profit_margin")
    private BigDecimal targetProfitMargin;
    /**
     * 目标利润
     */
    @TableField("target_profit")
    private BigDecimal targetProfit;
    /**
     * 项目人月数
     */
    @TableField("team_average_number")
    private BigDecimal teamAverageNumber;
    /**
     * 预计人均年产值
     */
    @TableField("expect_average_value")
    private BigDecimal expectAverageValue;
    /**
     * 总承包单位类型
     */
    @TableField("contract_unit_type")
    private String contractUnitType;
    /**
     * 危大工程
     */
    @TableField("danger_big_project")
    private String dangerBigProject;
    /**
     * 工程情况描述
     */
    @TableField("project_description")
    private String projectDescription;
    /**
     * 工程风险分析
     */
    @TableField("project_risk")
    private String projectRisk;
    /**
     * 备注
     */
    @TableField("modify_description")
    private String modifyDescription;

    /**
     * 创建人名称
     */
    @TableField("create_user_name")
    private String createUserName;
    /**
     * 经营立项ID
     */
    @TableField("approve_manage_id")
    private String approveManageId;

    /**
     * 是否新业主
     */
    @TableField("is_new_owner")
    private String isNewOwner;

    /**
     * 是否新区域
     */
    @TableField("is_new_area")
    private String isNewArea;

    /**
     * 是否聚焦
     */
    @TableField("is_focus")
    private String isFocus;

    /**
     * 中标/承接日期
     */
    @TableField("win_bid_date")
    private Date winBidDate;

    /**
     * 审批状态（工程启动）
     */
    @TableField("approve_state")
    private String approveState;

    /**
     * 审批结束日期（工程启动）
     */
    @TableField("approve_end_date")
    private Date approveEndDate;

    /**
     * 合约负责人
     */
    @TableField("contract_leader")
    private String contractLeader;

    /**
     * 技术负责人
     */
    @TableField("technical_leader")
    private String technicalLeader;

    /**
     * 项目负责人
     */
    @TableField("project_leader")
    private String projectLeader;
    /**
     * 项目群
     */
    @TableField("project_group")
    private String projectGroup;

    /**
     * oa流程ID
     */
    @TableField("oa_flow_id")
    private String oaFlowId;

    /**
     * 对应OA审批单据URL
     */
    @TableField("oa_flow_url")
    private String oaFlowUrl;
    /**
     * 产品段
     */
    @TableField("product_segment")
    private String productSegment;

    /**
     * 财务项目编码
     */
    @TableField("financial_item_code")
    private String financialItemCode;

    /**
     * 是否老数据
     */
    @TableField("is_old_data")
    private String isOldData;

    /**
     * 风险抵押金缴纳金额
     */
    @TableField("risk_mortgage_amount")
    private BigDecimal riskMortgageAmount;

    /**
     * 是否已存在项目编码
     */
    @TableField("is_exist_code")
    private String isExistCode;

    /**
     * 是否纳入报表统计
     */
    @TableField("is_fit_report")
    private String isFitReport;
    /**
     * 直委项目性质
     */
    @TableField("direct_project_nature")
    private String directProjectNature;
    /**
     * 初始合同金额
     */
    @TableField("initial_contract_amount")
    private BigDecimal initialContractAmount;
    /**
     * 合同金额是否有调整
     */
    @TableField("is_amount_adjust")
    private String isAmountAdjust;

    /**
     * 项目类型
     */
    @TableField("project_type")
    private String projectType;

    /**
     * 总承包项目id
     */
    @TableField("main_contract_id")
    private String mainContractId;
}
