package top.upstudy.crm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.upstudy.base.BaseController;
import top.upstudy.base.ResultInfo;
import top.upstudy.crm.pojo.Customer;
import top.upstudy.crm.pojo.CustomerLinkman;
import top.upstudy.crm.query.CustomerQuery;
import top.upstudy.crm.service.CustomerLinkmanService;
import top.upstudy.crm.service.CustomerOrderService;
import top.upstudy.crm.service.CustomerService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Weder
 * @since 2020-10-31
 */
@Controller
@RequestMapping("/legalCustomer")
public class LegalCustomerController extends BaseController {

    @Resource
    private CustomerService customerService;

    //客户联系人
    @Resource
    private CustomerLinkmanService customerLinkmanService;

    @Resource
    private CustomerOrderService customerOrderService;

    @GetMapping("index")
    public String index(){
        return "legalCustomer/legalcustomer";
    }


    @ApiOperation("自然人客户列表")
    @GetMapping("list")
    @ResponseBody
    public Map<String,Object> queryCustomersByParams(CustomerQuery customerQuery){
        customerQuery.setCustomerType(0);
        return customerService.queryCustomersByParams(customerQuery);
    }

       @ApiOperation("添加客户")
    @PostMapping("save")
    @ResponseBody
    public ResultInfo saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return  success("客户记录添加成功!");
    }

    @ApiOperation("更新客户")
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
        return  success("客户记录更新成功!");
    }


    @ApiOperation("添加或更新界面")
    @GetMapping("addOrUpdateCustomerPage")
    public String addOrUpdateCustomerPage(Integer id, Model model){
        model.addAttribute("customer",customerService.getById(id));
        return "legalCustomer/legal_add_update";
    }
}
