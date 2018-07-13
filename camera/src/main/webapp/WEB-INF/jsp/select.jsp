<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<script type="text/javascript">
	function submitForm(){
		document.getElementById("myselect").submit();
	}
</script>
<form action="/camera/history/showall" name="myselect" id="myselect">
<div class="form-group">
	<label style="float: left">第</label>
	<div style="float: left">
		<select class="select2-container select2" name="weektime" >
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
		</select>
	</div>
	<label style="float: left">周</label>
</div>
<div class="form-group" style="margin-left: 10px; float: left">
	<label style="float: left">星期</label>
	<div style="float: left">
		<select class="select2-container select2" name="weekday">
			<option value="1">一</option>
			<option value="2">二</option>
			<option value="3">三</option>
			<option value="4">四</option>
			<option value="5">五</option>
			<option value="6">六</option>
			<option value="7">日</option>
		</select>
	</div>
</div>
<div class="form-group" style="margin-left: 10px; float: left">
	<label style="float: left">第</label>
	<div style="float: left">
		<select class="select2-container select2" name="time" onchange="submitForm()">
			<option value="1">一</option>
			<option value="2">二</option>
			<option value="3">三</option>
			<option value="4">四</option>
			<option value="5">五</option>
		</select>
	</div>
	<label style="float: left">节课</label>
</div>
</form>