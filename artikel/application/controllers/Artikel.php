<?php

    defined('BASEPATH') OR exit('No direct script access allowed');

    require APPPATH . '/libraries/REST_Controller.php';
    use Restserver\Libraries\REST_Controller;

    class Artikel extends REST_Controller {

        function __construct($config = 'rest') {
            parent::__construct($config);
            $this->load->database();
        }

        public function index_get()
        {
            $this->db->select('*');
            $this->db->from('artikel');
            $query = $this->db->get()->result();
            $this->response(array('status' => 'sukses','result'=>$query, 200));
        }


        public function index_post()
        {
            $data = array(
                'like'     => $this->post('like'));
                $insert = $this->db->insert('artikel', $data);
                if ($insert) { $this->response(array('status' => 'sukses', 'result' => $data, 'message' => 'Berhasil'), 200);
                } else {
                    $this->response(array('status' => 'fail', 502));
            }
        }

        public function index_put()
        {
            $no = $this->put('no');
            $data = array(
                'like'     => $this->post('like'));
                $this->db->where('no', $no);
                $update = $this->db->update('artikel', $data);
                if ($update) {
                    $this->response($data, 200);
                } else {
                    $this->response(array('status' => 'fail', 502));
            }
        }

    }

    /* End of file Kategori.php */

?>